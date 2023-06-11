# Объектно-ориентированное программирование

## Принципы ООП: Инкапсуляция, наследование, полиморфизм

### lesson1 - Домашняя работа №1
```
Задача 1:
Создайте класс "Кот" (Cat) со следующими свойствами:

Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
```

```
Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:

Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает зна чения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
```

```
Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) со следующими свойствами и методами:

Класс "Книга" (Book):

Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор, доступность).
Класс "Библиотека" (Library):

Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
```

### lesson2 - Домашняя работа №2

```
У вас есть два варианта задач:

1)Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы. Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.

2)Реализовать класс Market и все его обязательные методы. Этот класс должен реализовывать методы из интерфейса QueueBehaviour, которые имитируют работу очереди. Кроме того, класс должен содержать методы, соответствующие интерфейсу MarketBehaviour, которые добавляют и удаляют людей из очереди, а также метод update, который обновляет состояние магазина путем принятия и отдачи заказов.

Для сдачи задания необходимо предоставить ссылку на проект в GitHub.

Пожалуйста, выберите одну из этих задач, с которой вы хотите продолжить, и уточните, какой именно класс вы выбрали для задачи 1, если решаете ее.
```

### lesson3 - Домашняя работа №3
```
Есть три варианта задач:

1) В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.

2)Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ, предоставив собственную реализацию.

3)(Опционально, по желанию) Задача: Написать функцию, которая принимает список объектов и компаратор для сортировки объектов по заданному критерию. Функция должна возвращать отсортированный список объектов.

```

### lesson4 - Домашняя работа №4

```
Задача 1

Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.

В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T. Мы просто выводим этот элемент на консоль с помощью метода System.out.println().

В методе main мы вызываем printElement с различными типами данных: целое число (Integer), строку (String) и число с плавающей запятой (Double). Компилятор автоматически выводит тип параметра T на основе переданных аргументов.

Таким образом, обобщенные методы позволяют нам писать код, который может работать с различными типами данных, обеспечивая простоту и гибкость использования.
```

```
Задача 2

Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.

В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. В результате мы получаем вывод на консоль элементов каждого массива.

Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных, обеспечивая повторное использование и гибкость.

Полезные материалы
https://metanit.com/java/tutorial/3.11.php
```

```
Задача 3 (по желанию)

Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает максимальное значение из них.

В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, ограниченных интерфейсом Comparable. Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.

В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double) и строку (String). В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.

Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, сохраняя при этом безопасность типов.
```

```
Задача(по желанию. Режим - Героя)

Напишите обобщенный класс DataContainer, который представляет собой контейнер для хранения и обработки данных. Класс должен иметь методы для добавления и получения элементов, а также методы для сортировки и вывода элементов.

В этом примере мы создаем обобщенный класс DataContainer, который использует массив для хранения элементов типа T. Класс имеет методы add для добавления элементов, get для получения элемента по индексу, sort для сортировки элементов с помощью переданного компаратора, и print для вывода элементов на консоль.

В методе main мы создаем объект DataContainer для хранения строк. Мы добавляем несколько строк, выводим их на консоль с помощью метода print, затем сортируем элементы в обратном порядке с помощью лямбда-выражения в методе sort и снова выводим отсортированные элементы на консоль.

Таким образом, обобщенные классы позволяют нам создавать универсальные контейнеры для хранения и обработки данных любого типа, обеспечивая безопасность типов и гибкость в использовании.
```

### lesson5 - Домашняя работа №5

```
Задача 1
Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), с возможностью выполнения базовых
математических операций, таких как сложение, вычитание, умножение и деление, работающий с дробными числами.
Доп. Задача (*) Мы также обеспечим обработку возможных ошибок, чтобы предотвратить некорректные операции.

По Желанию *.
Задача 2
Модель (Model): Создайте класс User для представления учетной записи пользователя. 
Этот класс будет содержать поля для имени, логина и пароля пользователя, а также методы доступа к этим полям. 
Модель также может содержать методы для сохранения и загрузки данных пользователя.

Представление (View): Создайте класс UserView, который будет отвечать за отображение информации о пользователе 
и взаимодействие с пользователем. Этот класс будет содержать методы для отображения формы регистрации, 
формы входа, формы изменения пароля и т.д. Он также будет содержать методы для получения введенных 
пользователем данных.

Презентер (Presenter): Создайте класс UserPresenter, который будет служить посредником между моделью и 
представлением. Презентер будет содержать ссылку на модель и представление, и будет обрабатывать 
пользовательские действия, такие как регистрация, вход, изменение пароля и т.д. Он будет вызывать 
соответствующие методы модели для выполнения операций и обновлять представление с помощью методов 
представления для отображения результатов.

Главный класс приложения: Создайте главный класс UserManagementApp, который будет являться точкой входа 
в приложение. В этом классе вы можете создать экземпляр модели, представления и презентера, и установить связь 
между ними. Например, вы можете передать ссылку на модель и представление в конструктор презентера.

В результате, при выполнении операций, таких как регистрация, вход, изменение пароля, пользовательский 
интерфейс будет взаимодействовать с презентером, презентер будет обращаться к модели для выполнения операций 
и обновлять представление с помощью методов представления.

Такая архитектура помогает разделить ответственность между компонентами приложения, облегчает тестирование 
и поддержку кода, а также позволяет легче масштабировать и расширять функциональность в будущем.
```