package upchi.api.movie.film.services;

import java.io.File;
import java.io.FileOutputStream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;

import upchi.api.movie.film.services.interfaces.ICoverImageService;
import upchi.api.movie.film.services.interfaces.IFilmService;

@Service
public class CoverImageServiceImpl implements ICoverImageService {
    @Autowired
    IFilmService filmServices;

    private AmazonS3 s3client;
    private String ENDPOINT_URL = "s3.us-east-1.amazonaws.com";
    private String BUCKET_NAME = "api-movies";
    private String ACCESS_KEY = "AKIAW3R32ZCTITVAFW5Q";
    private String SECRET_KEY = "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";

    @Override
    public String upload(MultipartFile multipartFile, Long idUser) {
        
        String fileUrl = "";

        try {

            File file = convertMultiPartToFile(multipartFile);
            String fileName = generateFileName(multipartFile);
            fileUrl = "https://" + BUCKET_NAME + "." + ENDPOINT_URL + "/" + fileName;
            uploadFileToS3Bucket(fileName, file);
            file.delete();

        } catch (Exception e) {
            e.printStackTrace();
        }
        filmServices.updateFilmCover(fileUrl, idUser);
        return fileUrl;
    }

    private File convertMultiPartToFile(MultipartFile file) throws java.io.IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }

    private String generateFileName(MultipartFile multiPart) {
        return multiPart.getOriginalFilename().replace(" ", "-");
    }

    private void uploadFileToS3Bucket(String fileName, File file) {
        PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKET_NAME, fileName, file)
                .withCannedAcl(CannedAccessControlList.PublicRead);
        s3client.putObject(putObjectRequest);
    }

    @PostConstruct
    private void initializeAmazon() {
        AWSCredentials credentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);
        s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();
    }

}
