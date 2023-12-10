# UsersCRUD (Workshop 3)

## Wstęp do warsztatu UsersCRUD
Celem dzisiejszego warsztatu jest wytworzenie aplikacji webowej, która będzie umożliwiać zarządzanie użytkownikami : **UsersCRUD**.

Dane do zasilenia naszego programu będziemy pobierać z bazy danych MySQL. Wykorzystamy utworzone podczas poprzedniego warsztatu klasy **User** oraz **UserDao**.

Przykład interakcji z programem:
![image](https://github.com/tomkwa26/Workshop-3/assets/130790056/982df553-cc77-472d-8ced-827309b8c343)

### Czego nauczysz się podczas tego warsztatu?
Warsztat w formie wykonania jednego dużego zadania jakim jest przygotowanie jednego większego programu na pewno daje duży zastrzyk praktycznej wiedzy i pozwala na szybsze i bardziej pewne poruszanie się w kodzie Javy, Servletach, wzorcu MVC czy programie IntelliJ.

W projekcie tym użyto praktycznie wszystkie rzeczy o których mówiliśmy podczas tego modułu takie jak:

* MVC,
* Servlety,
* OOP,
* MySQL,
* klasy DAO,
* Maven.

Wszystko to będzie możliwe do zastosowania w tym projekcie! To na pewno ugruntuje Twoją wiedzę.

## Jak zacząć pracę z tym projektem?
Na początek stwórz nowe repozytorium! Szczegółowy opis tego jak to zrobić, znajduje się w temacie **Przygotowanie repozytorium na GitHub**. Po wykonaniu czynności tam opisanych, wróć do tego artykułu.

W pierwszej kolejności utwórz bazę danych, a następnie przygotuj sobie wszystkie niezbędne zapytania:

* dodawanie użytkownika,
* zmiana danych,
* pobieranie po id,
* usuwanie po id,
* pobieranie wszystkich użytkowników.

# Ekrany aplikacji UsersCRUD

## Ekran wyświetlający listę wszystkich użytkowników
![image](https://github.com/tomkwa26/Workshop-3/assets/130790056/69dbe46d-bf61-460b-8171-d2a2ba3feb17)

Strona ma być dostępna pod adresem **/user/list**. Na liście użytkowników mają być dostępne trzy linki:

* do usuwania użytkownika (Usuń),
* do edycji użytkownika (Edytuj),
* do szczegółów użytkownika (Pokaż).

Nad listą ma być dostępny link z możliwością przejścia do formularza dodawania użytkownika.

## Formularz dodawania użytkownika
![image](https://github.com/tomkwa26/Workshop-3/assets/130790056/327ca894-5b85-4c9c-8c42-73dc1c07a618)

Strona ma być dostępna pod adresem **/user/add**. Po zatwierdzeniu ma nastąpić przekierowanie do adresu **/user/list**.

## Formularz edycji użytkownika
![image](https://github.com/tomkwa26/Workshop-3/assets/130790056/53e2530e-1223-4df9-bf33-1b188be49170)

Strona ma być dostępna pod adresem **/user/edit**. Po zatwierdzeniu ma nastąpić przekierowanie do adresu **/user/list**.

W formularzu mają się wyświetlić dane użytkownika, który jest edytowany, hasło pomijamy - należy je wpisać ponownie.

## Wyświetlanie danych użytkownika
![image](https://github.com/tomkwa26/Workshop-3/assets/130790056/e138303e-e8c0-429f-ae34-e51a3b24da36)

Strona ma być dostępna pod adresem **/user/show**. Po zatwierdzeniu ma nastąpić przekierowanie do adresu **/user/list**.

## Usuwanie użytkownika
Strona ma być dostępna pod adresem **/user/delete**. Po zatwierdzeniu ma nastąpić przekierowanie do adresu **/user/list**.

### Testuj na bieżąco
Dodając każdą z nowych funkcjonalności testuj działanie programu. Nie staraj się zrobić całego warsztatu od razu. Jeżeli masz z czymś problem używaj debugera aby krok po kroku śledzić działanie programu.

#### Powodzenia!
