# Progetto in Java con Thread

## Descrizione
Il progetto **GaraCavalli** simula una corsa tra 5 cavalli utilizzando i **Thread** di Java.  
Ogni cavallo ha una diversa velocità (parametro “lentezza”), e il programma determina quale arriva primo.
Uno dei cavalli viene scelto randomicamente e viene "azzoppato", ovvero, non arrivera' al termine della corsa.

## Classi principali
- **GestoreGaraCavalli**  
  Gestisce la gara, chiede i dati all’utente, avvia i thread e mostra il vincitore.
- **Cavallo (extends Thread)**  
  Rappresenta un cavallo che avanza passo dopo passo in base alla sua lentezza.

## Funzionamento
1. L’utente inserisce nome e lentezza dei cavalli.  
2. Uno dei cavalli viene scelto casualmente e “azzoppato” (interrotto).  
3. Gli altri cavalli partono contemporaneamente.  
4. Il primo che finisce imposta il proprio nome come vincitore.

## Concetti di programmazione
- Thread e concorrenza (`extends Thread`)
- Sincronizzazione con `join()`
- Metodi statici condivisi tra thread

## Autore
**Nome:** Crisan Bogdan Alexandru  
**Classe:** 5DINF  
**Scuola:** ITTS A. Volta – Perugia  
**Anno:** 2025
