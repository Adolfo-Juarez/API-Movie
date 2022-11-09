package upchi.api.movie.producer.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.producer.controllers.dtos.requests.PostProducerRequest;
import upchi.api.movie.producer.controllers.dtos.requests.UpdateProducerRequest;
import upchi.api.movie.producer.controllers.dtos.responses.GetProducerResponse;
import upchi.api.movie.producer.entities.Producer;
import upchi.api.movie.producer.repositories.IProducerRepository;
import upchi.api.movie.producer.services.interfaces.IProducerService;

@Service
public class ProducerServiceImpl implements IProducerService {

    @Autowired
    IProducerRepository repository;

    @Override
    public GetProducerResponse create(PostProducerRequest request) {
        return producerToGetResponse(repository.save(postRequestToProducer(request)));
    }

    @Override
    public List<GetProducerResponse> list() {
        return repository
                .findAll()
                .stream()
                .map(this::producerToGetResponse)
                .collect(Collectors.toList());
    }

    @Override
    public GetProducerResponse get(Long id) {
        return producerToGetResponse(repository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Producer no found")));
    }

    @Override
    public GetProducerResponse update(Long id, UpdateProducerRequest request) {
        Producer producer = repository.findById(id).orElseThrow(()-> new RuntimeException("Cannot update this producer"));

        return producerToGetResponse(repository.save(updateRequestToProducer(producer, request)));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public GetProducerResponse producerToGetResponse(Producer producer) {
        GetProducerResponse response = new GetProducerResponse();

        response.setId(producer.getId());
        response.setName(producer.getName());
        response.setLastname(producer.getLastname());

        return response;
    }

    public Producer postRequestToProducer(PostProducerRequest request) {
        Producer producer = new Producer();

        producer.setName(request.getName());
        producer.setLastname(request.getLastname());
        producer.setAge(request.getAge());
        producer.setNationality(request.getNationality());

        return producer;
    }

    public Producer updateRequestToProducer(Producer producer, UpdateProducerRequest updated) {
        producer.setAge(updated.getAge());
        producer.setNationality(updated.getNationality());

        return producer;
    }

    @Override
    public Producer findOneAndEnsureExist(Long id) {
        return repository.findById(id)
        .orElseThrow(()-> new RuntimeException("The producer does not exist"));
    }
}