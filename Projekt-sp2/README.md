# Projekt-sp2

Hyresbolag:

(Micke)Gäster:
Id,
namn,
personnummer,
telefonnummer,
BostadId,

(Jessica)Bostäder:
Id,
Adress,
kvadmeter,
postnummer,
vaktid,

(Ralle)Vaktmästare:
Id,
namn,
Personnummer,
telefonnummer,


```mermaid
---
title: building application
---
 classDiagram
     Janitor -- Building : janitorId
     Guest --|> Apartment : buildingId
     Apartment -- Building : id


     class Janitor{
       -Long id
       -String name
       -String phoneNumber  
       -String personalNumber
     }
     class Apartment{
       -Long id
       -String address
       -Long sq_m
       -Long janitorId
     }
     class Guest{
       -Long id  
       -String firstName
       -String lastName
       -String phoneNumber  
     }
     class Building{
        -Long id
        -List buildingId
        -List janitorId

     }