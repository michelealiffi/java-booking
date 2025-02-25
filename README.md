# Booking System

## Descrizione
**Booking System** è un'applicazione web che consente agli utenti di prenotare risorse (come stanze, veicoli, ecc.) in modo semplice ed efficiente. Gli utenti possono visualizzare le risorse disponibili, effettuare prenotazioni e gestire le loro prenotazioni precedenti.

L'applicazione è costruita utilizzando **Spring Boot** e **JPA**, con un'architettura MVC (Model-View-Controller) per separare i livelli di logica, dati e presentazione.

## Funzionalità
- **Gestione delle risorse**: gli amministratori possono aggiungere, visualizzare e rimuovere risorse (come stanze, veicoli, ecc.).
- **Prenotazioni**: gli utenti possono effettuare prenotazioni per risorse disponibili, selezionando la data di inizio e fine della prenotazione.
- **Gestione prenotazioni**: gli utenti possono visualizzare, annullare o modificare le loro prenotazioni.
- **Calcolo del prezzo**: il prezzo totale della prenotazione viene calcolato in base alla durata del soggiorno (o utilizzo della risorsa).
- **Relazioni tra entità**: il sistema gestisce le relazioni tra User, Resource e Booking utilizzando le annotazioni JPA.

## Tecnologie
- **Java** (Spring Boot)
- **Spring Data JPA** per la gestione del database
- **H2 Database** (per sviluppo e testing, può essere sostituito con un altro database relazionale come MySQL o PostgreSQL)
- **Thymeleaf** per il rendering delle pagine web (se implementato lato front-end)
- **REST API** per la gestione delle operazioni principali (se non si usa Thymeleaf)
  
## Prerequisiti
- Java 8 o superiore
- Maven o Gradle per la gestione delle dipendenze (Maven è il predefinito)
- Un database relazionale (H2 preconfigurato per l'esempio)

## Configurazione

1. **Clona il progetto**

```
git clone https://github.com/michelealiffi/java-booking.git
```

2. **Installa le dipendenze**

Se stai usando Maven, esegui il comando per scaricare le dipendenze:

```
mvn install
```

Se usi Gradle, esegui:

```
gradle build
```


3. **Configurazione del database**
Puoi usare H2 Database per l'ambiente di sviluppo. La configurazione di default è già presente nel file `application.properties`:

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

4. **Esegui l'applicazione**

Per avviare il progetto, esegui il comando:

```
mvn spring-boot:run
```
Oppure, se stai usando Gradle:
```
gradle bootRun
```

## Endpoint REST API
1. **Gestione risorse**

- `GET /resources` - Ottieni tutte le risorse
- `GET /resources/{id}` - Ottieni una risorsa per ID
- `POST /resources` - Crea una nuova risorsa
- `DELETE /resources/{id}` - Elimina una risorsa

2. **Gestione prenotazioni**

- `GET /bookings` - Ottieni tutte le prenotazioni
- `GET /bookings/user/{userId}` - Ottieni le prenotazioni di un utente
- `GET /bookings/resource/{resourceId}` - Ottieni le prenotazioni per risorsa
- `POST /bookings` - Crea una nuova prenotazione
- `DELETE /bookings/{id}` - Annulla una prenotazione
 
## Struttura del Progetto

```
booking-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── bookingsystem/
│   │   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── repository/
│   │   │   │   │   │   ├── service/
│   ├── resources/
│   │   ├── application.properties
│   │   ├── static/
│   │   ├── templates/
└── pom.xml or build.gradle
```


## Esempio di Utilizzo

1. **Creare una risorsa (stanza, veicolo, ecc.)**:

```
POST /resources
{
  "name": "Stanza 101",
  "description": "Stanza matrimoniale",
  "pricePerNight": 100
}
```

2. **Effettuare una prenotazione**:

```
POST /bookings
{
  "userId": 1,
  "resourceId": 1,
  "startDate": "2025-03-01",
  "endDate": "2025-03-05",
  "totalPrice": 400
}
```

## Contribuire
Se desideri contribuire a questo progetto, puoi fare un fork e inviare una pull request. Ogni contributo è benvenuto!

1. Fai un fork del progetto.
2. Crea un nuovo branch.
3. Aggiungi le tue modifiche.
4. Fai un commit delle modifiche.
5. Invia una pull request.

## Licenza
Questo progetto è distribuito sotto la licenza MIT. Vedi il file `LICENSE` per ulteriori dettagli.
