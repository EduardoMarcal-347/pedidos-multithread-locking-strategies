#  pedidos-multithread-locking-strategies

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]


<!-- PROJECT LOGO -->
<br />
<div align="center">
<!--   <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a> todo !!!-->

  <h3 align="center">pedidos-multithread-locking-strategies
</h3>

  <p align="center">
    Exploring Locks in Store Operations
    <br />
    <a href="https://github.com/EduardoMarcal-347/sockets-multithread/"><strong>Explore the docs »</strong></a>
  </p>
</div>


<!-- ABOUT THE PROJECT -->
## About The Project

This project aims to simulate a scenario where an online store wants to test the capability of inserting 1000 records into its order management system using two concurrency control techniques: PESSIMISTIC LOCK and OPTIMISTIC LOCK.

* **Insertion with Pessimistic Lock**: This functionality simulates the insertion of 1000 records into the store's database using the Pessimistic Lock technique. Pessimistic Lock ensures that, during the insertion operation, the affected records are locked against modifications by other processes.
* **Insertion with Optimistic Lock**: This functionality performs an insertion without explicit record locking. Instead, it uses the Optimistic Lock technique, which checks if there have been any modifications to the records since they were read until the moment they are updated. If there is concurrent modification, the update operation is cancelled.


<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

The project was built using a combination of technologies and frameworks. It primarily leverages Java for its core programming language. The Spring Framework was employed to facilitate various aspects of application development, including dependency injection, transaction management, and web application setup. JPA (Java Persistence API) and Hibernate were used for object-relational mapping, allowing seamless interaction with the underlying database.

For database management, an H2 Database was chosen, providing an efficient and lightweight solution for development and testing purposes. Flyway was utilized for database migration management, ensuring a structured and consistent database schema across different environments.

Additionally, the project integrated Apache HttpComponents to perform insertions within the API itself. This was achieved through a Client class, which made POST requests to the API, enabling the addition of data in a programmatic and automated manner. This integration was pivotal for the insertion functionality, providing an effective and controlled means of adding new records directly to the application.

[![Java][java.io]][java-url]


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

This project uses the Maven system for dependency management and compilation. Follow the steps below to run the application locally:

#### Prerequisites

- Make sure you have Maven installed on your system. If you don't, you can download and install it from the [official Maven website](https://maven.apache.org/download.cgi).

#### Installation

1. Clone the repository.:

    ```bash
    git clone git@github.com:EduardoMarcal-347/pedidos-multithread-locking-strategies.git
    ```

2. Navigate to the project desired directory.:

    ```bash
    cd pessimistic-pedidos-api
    ```
    or
    ```bash
    cd otimistic-pedidos-api
    ```
    
#### Running the application

1. In the project directory, navigate to the class `PedidosApplication.java`

2. Run the application. This will start the api.

#### Running the Client 

1. In the api directory, navigate to the folder clientRequests, and you will find the class `Client.java`

2. Run the application. This will start the client post requests.

Remember to configure the necessary information, such as the desired range to generate the random number in the request if you want to customize the specific outputs of your project, as indicated in the comments of the source code.

With these steps, you will be ready to use the application locally. If you encounter any issues or have any questions, feel free to reach out.

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Eduardo Marçal - edumsfilho347@gmail.com

Project Link: https://github.com/EduardoMarcal-347/pedidos-multithread-locking-strategies 

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

### Java

* [Oracle's Java Documentation](https://docs.oracle.com/en/java/) - The official Java language documentation provided by Oracle. Essential for understanding syntax, API, and best practices.

* [Baeldung's Java Guides](https://www.baeldung.com/guides) - A valuable source of tutorials and practical guides on various Java topics.

* [Java Code Geeks](https://www.javacodegeeks.com/) - An active community with a wide variety of Java articles and code examples.

### Pessimistic and Optimistic Locks

* [Pessimistic vs. Optimistic Locking in JPA](https://www.baeldung.com/jpa-pessimistic-locking) - An article on Baeldung explaining the difference between pessimistic and optimistic locking in JPA, along with examples.

* [Hibernate Documentation - Locking](https://docs.jboss.org/hibernate/orm/5.5/userguide/html_single/Hibernate_User_Guide.html#locking) - The official Hibernate documentation on locking, providing in-depth information about both pessimistic and optimistic locking strategies.

### Flyway

* [Flyway Documentation](https://flywaydb.org/documentation/) - The official documentation for Flyway, a database migration tool. It covers a wide range of topics, from getting started to advanced usage.

* [Baeldung's Flyway Tutorials](https://www.baeldung.com/flyway) - Baeldung's tutorials on Flyway, providing practical examples and best practices for database migrations.

### Apache HttpComponents

* [Apache HttpComponents Documentation](https://hc.apache.org/) - The official documentation for Apache HttpComponents. It offers detailed information on how to use the library for making HTTP requests.

* [Baeldung's Apache HttpComponents Guides](https://www.baeldung.com/httpclient) - Baeldung's guides on Apache HttpComponents, including tutorials on making different types of HTTP requests.

### JPA (Java Persistence API)

* [Oracle's JPA Documentation](https://docs.oracle.com/en/java/persistence/) - The official documentation for JPA provided by Oracle. It covers the basics of JPA, entity management, and more.

* [Baeldung's JPA Guides](https://www.baeldung.com/jpa) - Baeldung offers a comprehensive set of tutorials on various aspects of JPA, from basic concepts to advanced techniques.

### H2 Database

* [H2 Database Documentation](https://h2database.com/html/main.html) - The official documentation for the H2 database, providing information on installation, configuration, and usage.

* [Baeldung's H2 Database Guides](https://www.baeldung.com/spring-boot-h2-database) - Baeldung's guides on working with the H2 database in a Spring Boot application.

### Hibernate

* [Hibernate Documentation](https://docs.jboss.org/hibernate/orm/5.5/userguide/html_single/Hibernate_User_Guide.html) - The official Hibernate documentation. It covers a wide range of topics related to Hibernate, including configuration, mapping, and querying.

* [Baeldung's Hibernate Tutorials](https://www.baeldung.com/hibernate-tutorial) - Baeldung offers a series of tutorials on Hibernate, covering various aspects of the framework.


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/EduardoMarcal-347/pedidos-multithread-locking-strategies.svg?style=for-the-badge
[contributors-url]: https://github.com/EduardoMarcal-347/pedidos-multithread-locking-strategies/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/EduardoMarcal-347/pedidos-multithread-locking-strategies.svg?style=for-the-badge
[forks-url]: https://github.com/EduardoMarcal-347/pedidos-multithread-locking-strategies/network/members
[stars-shield]: https://img.shields.io/github/stars/EduardoMarcal-347/pedidos-multithread-locking-strategies.svg?style=for-the-badge
[stars-url]: https://github.com/EduardoMarcal-347/pedidos-multithread-locking-strategies/stargazers
[issues-shield]: https://img.shields.io/github/issues/EduardoMarcal-347/pedidos-multithread-locking-strategies.svg?style=for-the-badge
[issues-url]: https://github.com/EduardoMarcal-347/pedidos-multithread-locking-strategies/issues
[license-shield]: https://img.shields.io/github/license/EduardoMarcal-347/pedidos-multithread-locking-strategies.svg?style=for-the-badge
[license-url]: https://github.com/EduardoMarcal-347/pedidos-multithread-locking-strategies/blob/main/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://br.linkedin.com/in/eduardo-marcal-de-souza-filho
[java.io]: https://img.shields.io/badge/Java-f89820?style=for-the-badge&logo=java&logoColor=61DAFB
[java-url]: [https://nextjs.org/](https://docs.oracle.com/en/java/)
