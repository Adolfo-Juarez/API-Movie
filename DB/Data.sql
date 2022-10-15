-- Este script incrusta información a la tabla

-- Información recopilada de: https://www.imdb.com/chart/top/

-- ** IMPORTANTE **
-- Recuerda tener las tablas de la base de datos vacias antes de 
-- ejecutar este script SQL

-- INSERCCIÓN a Film
INSERT INTO api_movie.films(title, duration, year, genre, img_route) VALUES
(
    "The Shawshank Redemption",
    142,
    1994,
    "Drama",
    "the-shawshank-redemption-API-Movie.jpg"
),
(
    "The Godfather",
    175,
    1972,
    "Crime",
    "the-godfather-API-Movie.jpg"
),
(
    "The Dark Knight",
    152,
    2008,
    "Action",
    "the-dark-knight-API-Movie.jpg"
),
(
    "The Godfather Part II",
    202,
    1974,
    "Crime",
    "the-godfather-part-II-API-Movie.jpg"
),
(
    "12 Angry Men",
    96,
    1957,
    "Crime",
    "12-angry-men-API-Movie.jpg"
),
(
    "Schindler's List",
    195,
    1993,
    "Biography",
    "schindlers-list-API-Movie.jpg"
),
(
    "The Lord of the Rings: The Return of the King",
    201,
    2003,
    "Adventure",
    "the-lord-of-the-rings-the-return-of-the-king-API-Movie.jpg"
),
(
    "Pulp Fiction",
    154,
    1994,
    "Crime",
    "pulp-fiction-API-Movie.jpg"
),
(
    "The Lord of the Rings: The Fellowship of the Ring",
    178,
    2001,
    "Action",
    "The Lord of the Rings: The Fellowship of the Ring"
),
(
    "The Good, the Bad and the Ugly",
    178,
    1966,
    "Adventure",
    "the-good-the-bad-and-the-ugly-API-Movie.jpg"
);

-- INSERCCIÓN a Director

INSERT INTO api_movie.directors(name, lastname, nickname, age, nationality) VALUES 
(
    "Frank",
    "Darabont",
    "Darabont",
    59,
    "French"
),
(
    "Francis",
    "Ford Coppola",
    "Coppola",
    83,
    "American"
),
(
    "Christopher",
    "Nolan",
    "Christopher Nolan",
    52,
    "English"
),
(
    "Sidney",
    "Lumet",
    "Lumet",
    98,
    "American"
),
(
    "Thomas",
    "Keneally",
    "Thomas Keneally",
    35,
    "Australian"
),
(
    "Peter",
    "Jackson",
    "Peter Jackson",
    61,
    "New Zealander"
),
(
    "Quentin Jerome",
    "Tarantino",
    "Tarantino",
    59,
    "American"
);

-- INSERCIÓN a Actor

INSERT INTO api_movie.actors (name, lastname, nickname, age, nationality) VALUES 
(
    "Morgan",
    "Freeman",
    "Morgan Freeman",
    85,
    "American"
),
(
    "Timothy Francis",
    "Robbins",
    "Tim Robbins",
    63,
    "American"
),
(
    "Alfredo James",
    "Pancino",
    "Pacino",
    82,
    "American"
),
(
    "Marlon Brando",
    "Jr.",
    "Marlon Brando",
    80,
    "American"
),
(
    "Heath Andrew",
    "Ledger",
    "Heath Ledger",
    29,
    "American"
),
(
    "Christian Charles",
    "Philip Bale",
    "Christian Bale",
    82,
    "English"
),
(
    "Robert Anthony",
    "De Niro",
    "Robert De Niro",
    79,
    "American"
),
(
    "Henry Jaynes",
    "Fonda",
    "Henry Fonda",
    77,
    "American"
),
(
    "Lee J.",
    "Cobb",
    "Lee J. Cobb",
    65,
    "American"
),
(
    "William John",
    "Neeson",
    "Liam Neeson",
    70,
    "English"
),
(
    "Sir Ben",
    "Kingsley",
    "Ben Kingsley",
    78,
    "English"
),
(
    "Elijah Jordan",
    "Wood",
    "Elijah Wood",
    41,
    "American"
),
(
    "Karl",
    "Heinz Urban",
    "Karl Urban",
    50,
    "New Zealander"
),
(
    "Quentin Jerome",
    "Tarantino",
    "Quentin Tarantino",
    59,
    "American"
),
(
    "nombre",
    "lastname",
    "nickname",
    12,
    "American"
),
(
    "Viggo Peter",
    "Mortensen",
    "Viggo Mortensen",
    63,
    "American"
),
(
    "Clinton",
    "Eastwood Jr.",
    "Clint Eastwood",
    92,
    "American"
),
(
    "Eli",
    "Herschel Wallach",
    "Eli Wallach",
    99,
    "American"
);

-- INSERCCIÓN en Studio

INSERT INTO api_movie.studios (headquarters, name) VALUES 
(
    "Culver City, California, United States",
    "Columbia Pictures"
),
(
    "Hollywood, Los Ángeles, California, United States",
    "Paramount Pictures"
),
(
    "Hollywood, Los Ángeles, California, United States",
    "Warner Bros. Pictures"
),
(
    "EU",
    "Orion-Nova Productions"
),
(
    "10 Universal City Plaza, Universal City, California, United States",
    "Universal Pictures"
),
(
    "New York City, United States",
    "New Line Cinema"
),
(
    "Buffalo, New York, United States",
    "Miramax, LLC"
),
(
    "EU",
    "Produzioni Europee Associati"
);

-- Insercciones en PREMIERES

INSERT INTO premieres (cinema, date) VALUES 
(
    'Ohio Theatre, 138 Park Ave., W., Mansfield, Ohio', 
    '1994-09-23 00:00:00'
),
(
    "Loew's State Theatre, Times Square, New York City", 
    '1972-03-14 00:00:00'
),
(
    'AMC Lincoln Square 13 & IMAX, 1998 Broadway, New York, 10023', 
    '2008-07-14 00:00:00'
),
(
    'Cinema in New York City', 
    '1974-12-12 00:00:00'
),
(
    'Saban Theatre, 8440 Wilshire Boulevard Beverly Hills, California United States', 
    '1957-04-10 00:00:00'
),
(
    'Theatres in Washington, D.C.', 
    '1993-11-30 00:00:00'
),
(
    'Embassy Theatre, 9-11 Kent Terrace, Wellington, New Zealand', 
    '2003-12-17 00:00:00'
),
(
    'Cannes Film Festival, Cannes, France', 
    '1994-05-21 00:00:00'
),
(
    'Odeon Luxe Leicester Square, 24-26 Leicester Square, London', 
    '2001-12-10 00:00:00'
),
(
    'Cinnema in Italy', 
    '1966-12-23 00:00:00'
);