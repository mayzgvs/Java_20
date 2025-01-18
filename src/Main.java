import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        1. Класс "Человек"
//        Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста. Добавьте метод для изменения имени.


//            Person person = new Person("Николай", 23, "Мужчина");
//            person.displayInfo();
//
//            person.increaseAge();
//            System.out.println("После увеличения возраста:");
//            person.displayInfo();
//
//            person.changeName("Сергей");
//            System.out.println("После изменения имени:");
//            person.displayInfo();


//        2. Наследование: Класс "Работник" и "Менеджер"
//        Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.

//        Manager manager = new Manager("Алексей", 35, "Мужчина", 50000);
//        Worker worker1 = new Worker("Иван", 30, "Мужчина", 30000);
//        Worker worker2 = new Worker("Мария", 28, "Женщина", 32000);
//
//        manager.addSubordinate(worker1);
//        manager.addSubordinate(worker2);
//
//        System.out.println("Информация о менеджере:");
//        manager.displayInfo();

//        3. Полиморфизм: Животные
//        Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс. Продемонстрируйте полиморфизм на примере массива животных.

//        Animal[] animals = new Animal[3];
//        animals[0] = new Dog();
//        animals[1] = new Cat();
//        animals[2] = new Cow();
//
//        // Вызываем метод makeSound() для каждого животного
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }

//        4. Абстрактный класс "Транспорт"
//        Создайте абстрактный класс Transport с абстрактным методом move(). Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().
//
//        // Создаем массив транспортных средств
//        Transport[] transports = new Transport[2];
//        transports[0] = new Car();
//        transports[1] = new Bike();
//
//        // Вызываем метод move() для каждого транспортного средства
//        for (Transport transport : transports) {
//            transport.move();
//        }


//        5. Класс "Книга" и "Библиотека"
//        Создайте класс Book с полями title, author, и year. Создайте класс Library, который содержит коллекцию книг и методы для добавления книг, поиска по автору и году публикации.

//        Library library = new Library();
//
//        // Добавление книг в библиотеку
//        library.addBook(new Book("А зори здесь тихие...", "Борис Васильев", 2020));
//        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 2000));
//        library.addBook(new Book("Братья Карамазовы", "Фёдор Достоевский", 1925));
//
//        System.out.println("Все книги в библиотеке:");
//        library.displayBooks();
//
//        // Поиск книг по автору
//        String searchAuthor = "Борис Васильев";
//        System.out.println("\nКниги автора " + searchAuthor + ":");
//        List<Book> booksByAuthor = library.findBooksByAuthor(searchAuthor);
//        for (Book book : booksByAuthor) {
//            System.out.println(book);
//        }
//
//        // Поиск книг по году
//        int searchYear = 2000;
//        System.out.println("\nКниги, опубликованные в " + searchYear + ":");
//        List<Book> booksByYear = library.findBooksByYear(searchYear);
//        for (Book book : booksByYear) {
//            System.out.println(book);
//        }

//        6. Инкапсуляция: Банк
//        Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств. Обеспечьте инкапсуляцию для безопасности данных счета.

//        BankAccount account = new BankAccount("123456789", 1000.00);
//
//        // Отображение номера счета и текущего баланса
//        System.out.println("Номер счета: " + account.getAccountNumber());
//        System.out.println("Текущий баланс: " + account.getBalance());
//
//        // Пополнение счета
//        account.deposit(500.00);
//
//        // Снятие средств
//        account.withdraw(300.00);
//
//        // Попытка снять больше средств, чем на счете
//        account.withdraw(1500.00);

//    //    7. Счетчик объектов
//     //   Создайте класс Counter, который хранит количество созданных объектов данного класса. Реализуйте статическое поле для учета количества объектов и метод для его увеличения при каждом создании объекта.
//
//        // Создание объектов Counter
//        Counter counter1 = new Counter();
//        Counter counter2 = new Counter();
//        Counter counter3 = new Counter();
//
//        // Вывод текущего количества объектов
//        System.out.println("Количество созданных объектов Counter: " + Counter.getObjectCount());

//        8. Площадь фигур
//        Создайте абстрактный класс Shape с абстрактным методом getArea(). Реализуйте классы Circle и Rectangle, которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.

//    // Создание объектов Circle и Rectangle
//        Shape circle = new Circle(5.0); // Радиус 5
//        Shape rectangle = new Rectangle(4.0, 6.0); // Ширина 4 и высота 6
//
//        // Вывод площади круга и прямоугольника
//        System.out.println("Площадь круга: " + circle.getArea());
//        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

//        9. Наследование: Животные и их движения
//        Создайте класс Animal с методом move(). Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move() (рыба плавает, птица летает, собака бегает).

//        // Создание объектов для каждого типа животных
//        Animal fish = new Fish();
//        Animal bird = new Bird();
//        Animal dog = new Dog();
//
//        // Вывод информации о движении каждого животного
//        fish.move(); // Рыба плавает.
//        bird.move(); // Птица летает.
//        dog.move(); // Собака бегает.

//        10. Работа с коллекциями: Университет
//        Создайте класс Student с полями name, group, grade. Создайте класс University, который содержит список студентов и методы для добавления студентов, сортировки по имени и фильтрации по успеваемости.

//        University university = new University();
//
//        // Добавление студентов
//        university.addStudent(new Student("Анна", "Группа A", 4.5));
//        university.addStudent(new Student("Дмитрий", "Группа B", 3.8));
//        university.addStudent(new Student("Ольга", "Группа A", 5.0));
//        university.addStudent(new Student("Иван", "Группа C", 2.9));
//
//        // Сортировка студентов по имени
//        System.out.println("Студенты, отсортированные по имени:");
//        List<Student> sortedStudents = university.sortByName();
//        sortedStudents.forEach(System.out::println);
//
//        // Фильтрация студентов по успеваемости
//        double minGrade = 4.0;
//        System.out.println("\nСтуденты с успеваемостью выше " + minGrade + ":");
//        List<Student> filteredStudents = university.filterByGrade(minGrade);
//        filteredStudents.forEach(System.out::println);

//        11. Класс "Магазин"
//        Реализуйте класс Product с полями name, price, и quantity. Создайте класс Store, который содержит список продуктов и методы для добавления, удаления и поиска товаров по имени.

//        Store store = new Store();
//
//        // Добавление продуктов
//        store.addProduct(new Product("Хлеб", 50.0, 20));
//        store.addProduct(new Product("Молоко", 25.0, 10));
//        store.addProduct(new Product("Яблоки", 60.0, 30));
//
//        // Отображение всех продуктов
//        store.displayProducts();
//
//        // Поиск продукта
//        String searchName = "Молоко";
//        Optional<Product> foundProduct = store.findProductByName(searchName);
//        foundProduct.ifPresentOrElse(
//                product -> System.out.println("Найден продукт: " + product),
//                () -> System.out.println("Продукт '" + searchName + "' не найден.")
//        );
//
//        // Удаление продукта
//        String removeName = "Яблоки";
//        boolean removed = store.removeProductByName(removeName);
//        if (removed) {
//            System.out.println("Продукт '" + removeName + "' успешно удален.");
//        }
//
//        // Отображение всех продуктов после удаления
//        store.displayProducts();

//        12. Интерфейс "Платежная система"
//        Создайте интерфейс PaymentSystem с методами pay() и refund(). Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.

//        PaymentSystem creditCard = new CreditCard("1234-5678-9012-3456");
//        creditCard.pay(100.0);
//        creditCard.refund(50.0);
//
//        PaymentSystem payPal = new PayPal("user@example.com");
//        payPal.pay(200.0);
//        payPal.refund(75.0);

//        13. Генерация уникальных идентификаторов
//        Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса. Реализуйте этот функционал через статическое поле и метод.

//        Product product1 = new Product("Товар 1");
//        Product product2 = new Product("Товар 2");
//        Product product3 = new Product("Товар 3");
//
//        System.out.println("ID: " + product1.getId() + ", Name: " + product1.getName());
//        System.out.println("ID: " + product2.getId() + ", Name: " + product2.getName());
//        System.out.println("ID: " + product3.getId() + ", Name: " + product3.getName());

//        14. Класс "Точка" и "Прямоугольник"
//        Создайте класс Point с координатами x и y. Реализуйте класс Rectangle, который содержит две точки (левая верхняя и правая нижняя). Реализуйте метод для вычисления площади прямоугольника.

//        Point topLeft = new Point(1, 4);
//        Point bottomRight = new Point(5, 1);
//
//        Rectangle rectangle = new Rectangle(topLeft, bottomRight);
//
//        System.out.println("Площадь прямоугольника: " + rectangle.area());


//        15. Комплексные числа
//        Создайте класс ComplexNumber с полями для действительной и мнимой частей. Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.

//        ComplexNumber num1 = new ComplexNumber(3, 2);  // 3 + 2i
//        ComplexNumber num2 = new ComplexNumber(1, 7);  // 1 + 7i
//
//        System.out.println("Сложение: " + num1.add(num2));
//        System.out.println("Вычитание: " + num1.subtract(num2));
//        System.out.println("Умножение: " + num1.multiply(num2));
//        System.out.println("Деление: " + num1.divide(num2));

//        16. Перегрузка операторов: Матрица
//        Создайте класс Matrix, представляющий двумерную матрицу. Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.
//
//        // Создание первой матрицы 2x2
//        Matrix matrix1 = new Matrix(2, 2);
//        matrix1.setValue(0, 0, 1);
//        matrix1.setValue(0, 1, 2);
//        matrix1.setValue(1, 0, 3);
//        matrix1.setValue(1, 1, 4);
//
//        // Создание второй матрицы 2x2
//        Matrix matrix2 = new Matrix(2, 2);
//        matrix2.setValue(0, 0, 5);
//        matrix2.setValue(0, 1, 6);
//        matrix2.setValue(1, 0, 7);
//        matrix2.setValue(1, 1, 8);
//
//        // Сложение матриц
//        Matrix sum = matrix1.add(matrix2);
//        System.out.println("Сумма матриц:\n" + sum);
//
//        // Умножение матриц
//        Matrix product = matrix1.multiply(matrix2);
//        System.out.println("Произведение матриц:\n" + product);
//
//        // Использование перегруженных методов
//        Matrix sumUsingStaticMethod = Matrix.add(matrix1, matrix2);
//        System.out.println("Сумма (статический метод):\n" + sumUsingStaticMethod);
//
//        Matrix productUsingStaticMethod = Matrix.multiply(matrix1, matrix2);
//        System.out.println("Произведение (статический метод):\n" + productUsingStaticMethod);

//        17. Создание игры с использованием ООП
//        Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, с полями и методами, описывающими их поведение.

//        // Создание оружия
//        Weapon sword = new Weapon("Меч", 10);
//
//        // Создание игрока и врага
//        Player player = new Player("Игрок", 50, sword);
//        Enemy enemy = new Enemy("Враг", 30);
//
//        // Игровой процесс
//        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
//            player.attack(enemy);
//            if (enemy.getHealth() > 0) {
//                enemy.attack(player);
//            }
//        }
//
//        // Определение победителя
//        if (player.getHealth() > 0) {
//            System.out.println(player.getName() + " победил!");
//        } else {
//            System.out.println(enemy.getName() + " победил!");
//        }

//        18. Автоматизированная система заказов
//        Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.

//        // Создаем продукты
//        Product apple = new Product("Яблоко", 1.0);
//        Product banana = new Product("Банан", 0.5);
//        Product orange = new Product("Апельсин", 1.5);
//
//        // Создаем клиента
//        Customer customer1 = new Customer("Иван");
//
//        // Создаем заказы
//        Order order1 = new Order(customer1);
//        order1.addProduct(apple);
//        order1.addProduct(banana);
//
//        Order order2 = new Order(customer1);
//        order2.addProduct(orange);
//        order2.addProduct(banana);
//
//        // Печатаем историю заказов
//        customer1.printOrderHistory();

//        19. Наследование: Электроника
//        Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.

//        // Создаем экземпляры смартфона и ноутбука
//        Smartphone smartphone = new Smartphone("Samsung");
//        Laptop laptop = new Laptop("Dell");
//
//        // Тестируем методы
//        smartphone.turnOn();
//        smartphone.takePhoto();
//        smartphone.turnOff();
//
//        System.out.println(); // Разделитель вывода
//
//        laptop.turnOn();
//        laptop.runApplication("Microsoft Word");
//        laptop.turnOff();

//        20. Игра "Крестики-нолики"
//        Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.
//
//        Player player1 = new Player("Player 1", 'X');
//        Player player2 = new Player("Player 2", 'O');
//
//        Game game = new Game(player1, player2);
//        game.play();
//
//    }
//}
//        1. Класс "Человек"
//        Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста. Добавьте метод для изменения имени.

// class Person {
//    protected String name;
//    protected int age;
//    protected String gender;
//
//    // Конструктор класса
//    public Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    // Метод для вывода информации о человеке
//    public void displayInfo() {
//        System.out.println("Имя: " + name);
//        System.out.println("Возраст: " + age);
//        System.out.println("Пол: " + gender);
//    }
//
//    public void increaseAge() {
//        age++;
//    }
//
//    public void changeName(String newName) {
//        this.name = newName;
//    }
//}


//        2. Наследование: Класс "Работник" и "Менеджер"
//        Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.

//    class Worker extends Person {
//        private double salary;
//
//        // Конструктор класса Worker
//        public Worker(String name, int age, String gender, double salary) {
//            super(name, age, gender);
//            this.salary = salary;
//        }
//
//        // Метод для вывода информации о работнике
//        @Override
//        public void displayInfo() {
//            super.displayInfo();
//            System.out.println("Зарплата: " + salary);
//        }
//
//        public void changeSalary(double newSalary) {
//            this.salary = newSalary;
//        }
//    }
//
//
//
//    class Manager extends Worker {
//        private List<Worker> subordinates;
//
//        // Конструктор класса Manager
//        public Manager(String name, int age, String gender, double salary) {
//            super(name, age, gender, salary);
//            this.subordinates = new ArrayList<>();
//        }
//
//        // Метод для добавления подчиненного
//        public void addSubordinate(Worker worker) {
//            subordinates.add(worker);
//        }
//
//        // Метод для вывода информации о менеджере и его подчиненных
//        @Override
//        public void displayInfo() {
//            super.displayInfo();
//            System.out.println("Подчиненные:");
//            for (Worker worker : subordinates) {
//                System.out.println(" - " + worker.name);
//            }
//        }
//    }

//        3. Полиморфизм: Животные
//        Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс. Продемонстрируйте полиморфизм на примере массива животных.

//interface Animal {
//    void makeSound();
//}
//
//// Класс Dog
//class Dog implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Гав-гав");
//    }
//}
//
//// Класс Cat
//class Cat implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Мяу-мяу");
//    }
//}
//
//// Класс Cow
//class Cow implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Му-му");
//    }

//        4. Абстрактный класс "Транспорт"
//        Создайте абстрактный класс Transport с абстрактным методом move(). Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().

//    // Абстрактный класс Transport
//    abstract class Transport {
//        // Абстрактный метод move()
//        public abstract void move();
//    }
//
//    // Класс Car, наследующийся от Transport
//    class Car extends Transport {
//        @Override
//        public void move() {
//            System.out.println("Машина движется по дороге.");
//        }
//    }
//
//    // Класс Bike, наследующийся от Transport
//    class Bike extends Transport {
//        @Override
//        public void move() {
//            System.out.println("Велосипед движется по тропинке.");
//        }
//    }

//        5. Класс "Книга" и "Библиотека"
//        Создайте класс Book с полями title, author, и year. Создайте класс Library, который содержит коллекцию книг и методы для добавления книг, поиска по автору и году публикации.

//// Класс Book
//class Book {
//    private String title;
//    private String author;
//    private int year;
//
//    // Конструктор
//    public Book(String title, String author, int year) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//    }
//
//    // Геттеры
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    // Переопределение метода toString() для удобного отображения информации о книге
//    @Override
//    public String toString() {
//        return title + " by " + author + " (" + year + ")";
//    }
//}
//
//// Класс Library
//class Library {
//    private List<Book> books;
//
//    // Конструктор
//    public Library() {
//        books = new ArrayList<>();
//    }
//
//    // Метод для добавления книги
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    // Метод для поиска книг по автору
//    public List<Book> findBooksByAuthor(String author) {
//        List<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getAuthor().equalsIgnoreCase(author)) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
//
//    // Метод для поиска книг по году публикации
//    public List<Book> findBooksByYear(int year) {
//        List<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getYear() == year) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
//
//    // Метод для отображения всех книг в библиотеке
//    public void displayBooks() {
//        if (books.isEmpty()) {
//            System.out.println("Библиотека пуста.");
//        } else {
//            for (Book book : books) {
//                System.out.println(book);
//            }
//        }
//    }
//}

//        6. Инкапсуляция: Банк
//        Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств. Обеспечьте инкапсуляцию для безопасности данных счета.

//// Класс BankAccount
// class BankAccount {
//    private String accountNumber; // Номер счета
//    private double balance; // Баланс счета
//
//    // Конструктор
//    public BankAccount(String accountNumber, double initialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = initialBalance;
//    }
//
//    // Метод для пополнения счета
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Пополнено: " + amount + ". Новый баланс: " + balance);
//        } else {
//            System.out.println("Сумма пополнения должна быть положительной.");
//        }
//    }
//
//    // Метод для снятия средств
//    public void withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.println("Снято: " + amount + ". Остаток на счете: " + balance);
//        } else if (amount > balance) {
//            System.out.println("Недостаточно средств для снятия " + amount + ".");
//        } else {
//            System.out.println("Сумма снятия должна быть положительной.");
//        }
//    }
//
//    // Метод для получения текущего баланса
//    public double getBalance() {
//        return balance;
//    }
//
//    // Метод для получения номера счета
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//}


//        7. Счетчик объектов
//        Создайте класс Counter, который хранит количество созданных объектов данного класса. Реализуйте статическое поле для учета количества объектов и метод для его увеличения при каждом создании объекта.

//// Класс Counter
// class Counter {
//    private static int objectCount = 0; // Статическое поле для хранения количества объектов
//
//    // Конструктор
//    public Counter() {
//        incrementCounter(); // Увеличение счетчика при создании нового объекта
//    }
//
//    // Метод для увеличения счетчика
//    private void incrementCounter() {
//        objectCount++;
//    }
//
//    // Статический метод для получения текущего количества объектов
//    public static int getObjectCount() {
//        return objectCount;
//    }
//}

//        8. Площадь фигур
//        Создайте абстрактный класс Shape с абстрактным методом getArea(). Реализуйте классы Circle и Rectangle, которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.

//// Абстрактный класс Shape
//abstract class Shape {
//    // Абстрактный метод для вычисления площади
//    public abstract double getArea();
//}
//
//// Класс Circle, наследующий от Shape
//class Circle extends Shape {
//    private double radius;
//
//    // Конструктор
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    // Реализация метода getArea()
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius; // Площадь круга
//    }
//}
//
//// Класс Rectangle, наследующий от Shape
//class Rectangle extends Shape {
//    private double width;
//    private double height;
//
//    // Конструктор
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    // Реализация метода getArea()
//    @Override
//    public double getArea() {
//        return width * height; // Площадь прямоугольника
//    }
//}

//        9. Наследование: Животные и их движения
//        Создайте класс Animal с методом move(). Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move() (рыба плавает, птица летает, собака бегает).

//// Базовый класс Animal
//class Animal {
//    // Метод move() для описания движения
//    public void move() {
//        System.out.println("Животное двигается.");
//    }
//}
//
//// Класс Fish, наследующий от Animal
//class Fish extends Animal {
//    // Переопределение метода move()
//    @Override
//    public void move() {
//        System.out.println("Рыба плавает.");
//    }
//}
//
//// Класс Bird, наследующий от Animal
//class Bird extends Animal {
//    // Переопределение метода move()
//    @Override
//    public void move() {
//        System.out.println("Птица летает.");
//    }
//}
//
//// Класс Dog, наследующий от Animal
//class Dog extends Animal {
//    // Переопределение метода move()
//    @Override
//    public void move() {
//        System.out.println("Собака бегает.");
//    }
//}


//        10. Работа с коллекциями: Университет
//        Создайте класс Student с полями name, group, grade. Создайте класс University, который содержит список студентов и методы для добавления студентов, сортировки по имени и фильтрации по успеваемости.
//
//// Класс Student
//class Student {
//    private String name;
//    private String group;
//    private double grade;
//
//    // Конструктор
//    public Student(String name, String group, double grade) {
//        this.name = name;
//        this.group = group;
//        this.grade = grade;
//    }
//
//    // Геттеры
//    public String getName() {
//        return name;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//
//    // Переопределение метода toString() для вывода информации о студенте
//    @Override
//    public String toString() {
//        return "Студент: " + name + ", Группа: " + group + ", Успеваемость: " + grade;
//    }
//}
//
//// Класс University
//class University {
//    private List<Student> students;
//
//    // Конструктор
//    public University() {
//        students = new ArrayList<>();
//    }
//
//    // Метод для добавления студента
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    // Метод для сортировки студентов по имени
//    public List<Student> sortByName() {
//        return students.stream()
//                .sorted(Comparator.comparing(Student::getName))
//                .collect(Collectors.toList());
//    }
//
//    // Метод для фильтрации студентов по успеваемости
//    public List<Student> filterByGrade(double minGrade) {
//        return students.stream()
//                .filter(student -> student.getGrade() >= minGrade)
//                .collect(Collectors.toList());
//    }
//}

//        11. Класс "Магазин"
//        Реализуйте класс Product с полями name, price, и quantity. Создайте класс Store, который содержит список продуктов и методы для добавления, удаления и поиска товаров по имени.

//// Класс для продукта
//class Product {
//    private String name;
//    private double price;
//    private int quantity;
//
//    // Конструктор
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    // Геттеры
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    // Метод для уменьшения количества
//    public void reduceQuantity(int amount) {
//        if (amount <= quantity) {
//            quantity -= amount;
//        } else {
//            System.out.println("Недостаточно товара на складе.");
//        }
//    }
//
//    // Метод для представления продукта в виде строки
//    @Override
//    public String toString() {
//        return "Продукт: " + name + ", Цена: " + price + ", Количество: " + quantity;
//    }
//}
//
//// Класс для магазина
//class Store {
//    private List<Product> products;
//
//    // Конструктор
//    public Store() {
//        products = new ArrayList<>();
//    }
//
//    // Метод для добавления продукта
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    // Метод для удаления продукта по имени
//    public boolean removeProductByName(String name) {
//        Optional<Product> productToRemove = products.stream()
//                .filter(product -> product.getName().equalsIgnoreCase(name))
//                .findFirst();
//
//        if (productToRemove.isPresent()) {
//            products.remove(productToRemove.get());
//            return true;
//        } else {
//            System.out.println("Продукт с именем '" + name + "' не найден.");
//            return false;
//        }
//    }
//
//    // Метод для поиска продукта по имени
//    public Optional<Product> findProductByName(String name) {
//        return products.stream()
//                .filter(product -> product.getName().equalsIgnoreCase(name))
//                .findFirst();
//    }
//
//    // Метод для отображения всех продуктов
//    public void displayProducts() {
//        if (products.isEmpty()) {
//            System.out.println("Список продуктов пуст.");
//        } else {
//            System.out.println("Список продуктов:");
//            products.forEach(System.out::println);
//        }
//    }
//}

//        12. Интерфейс "Платежная система"
//        Создайте интерфейс PaymentSystem с методами pay() и refund(). Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.

//
//// Интерфейс PaymentSystem
//interface PaymentSystem {
//    void pay(double amount);
//    void refund(double amount);
//}
//
//// Класс CreditCard, реализующий интерфейс PaymentSystem
//class CreditCard implements PaymentSystem {
//    private String cardNumber;
//
//    public CreditCard(String cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Оплата " + amount + " с кредитной карты " + cardNumber);
//    }
//
//    @Override
//    public void refund(double amount) {
//        System.out.println("Возврат " + amount + " на кредитную карту " + cardNumber);
//    }
//}
//
//// Класс PayPal, реализующий интерфейс PaymentSystem
//class PayPal implements PaymentSystem {
//    private String email;
//
//    public PayPal(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Оплата " + amount + " через PayPal с email " + email);
//    }
//
//    @Override
//    public void refund(double amount) {
//        System.out.println("Возврат " + amount + " на PayPal с email " + email);
//    }
//}

//        13. Генерация уникальных идентификаторов
//        Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса. Реализуйте этот функционал через статическое поле и метод.

//// Класс UniqueID для генерации уникальных идентификаторов
//class UniqueID {
//    private static int counter = 0;
//
//    // Метод для генерации уникального идентификатора
//    public static int generateID() {
//        return ++counter;
//    }
//}
//
//// Пример класса, использующего UniqueID
//class Product {
//    private int id;
//    private String name;
//
//    public Product(String name) {
//        this.name = name;
//        this.id = UniqueID.generateID(); // Генерация уникального идентификатора
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//}

//        14. Класс "Точка" и "Прямоугольник"
//        Создайте класс Point с координатами x и y. Реализуйте класс Rectangle, который содержит две точки (левая верхняя и правая нижняя). Реализуйте метод для вычисления площади прямоугольника.

//
//// Класс Point для представления точки с координатами x и y
//class Point {
//    private double x;
//    private double y;
//
//    // Конструктор
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    // Геттеры
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//}
//
//// Класс Rectangle для представления прямоугольника
//class Rectangle {
//    private Point topLeft;  // Левая верхняя точка
//    private Point bottomRight;  // Правая нижняя точка
//
//    // Конструктор
//    public Rectangle(Point topLeft, Point bottomRight) {
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
//    }
//
//    // Метод для вычисления площади прямоугольника
//    public double area() {
//        double width = bottomRight.getX() - topLeft.getX();
//        double height = topLeft.getY() - bottomRight.getY();
//        return width * height;
//    }
//}

//        15. Комплексные числа
//        Создайте класс ComplexNumber с полями для действительной и мнимой частей. Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.

//// Класс для представления комплексного числа
//class ComplexNumber {
//    private double real;  // Действительная часть
//    private double imaginary;  // Мнимая часть
//
//    // Конструктор
//    public ComplexNumber(double real, double imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//
//    // Метод для сложения комплексных чисел
//    public ComplexNumber add(ComplexNumber other) {
//        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
//    }
//
//    // Метод для вычитания комплексных чисел
//    public ComplexNumber subtract(ComplexNumber other) {
//        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
//    }
//
//    // Метод для умножения комплексных чисел
//    public ComplexNumber multiply(ComplexNumber other) {
//        double realPart = this.real * other.real - this.imaginary * other.imaginary;
//        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    // Метод для деления комплексных чисел
//    public ComplexNumber divide(ComplexNumber other) {
//        double denominator = other.real * other.real + other.imaginary * other.imaginary;
//        if (denominator == 0) {
//            throw new ArithmeticException("Деление на ноль");
//        }
//        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
//        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    // Метод для вывода комплексного числа в строковом формате
//    @Override
//    public String toString() {
//        if (imaginary >= 0) {
//            return real + " + " + imaginary + "i";
//        } else {
//            return real + " - " + Math.abs(imaginary) + "i";
//        }
//    }
//}

//        16. Перегрузка операторов: Матрица
//        Создайте класс Matrix, представляющий двумерную матрицу. Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.

//// Класс для представления двумерной матрицы
//class Matrix {
//    private final int rows; // Количество строк
//    private final int cols; // Количество столбцов
//    private final double[][] data; // Данные матрицы
//
//    // Конструктор
//    public Matrix(int rows, int cols) {
//        this.rows = rows;
//        this.cols = cols;
//        this.data = new double[rows][cols];
//    }
//
//    // Метод для установки значения в матрице
//    public void setValue(int row, int col, double value) {
//        if (row >= 0 && row < rows && col >= 0 && col < cols) {
//            data[row][col] = value;
//        } else {
//            throw new IndexOutOfBoundsException("Индекс вне границ матрицы");
//        }
//    }
//
//    // Метод для получения значения из матрицы
//    public double getValue(int row, int col) {
//        if (row >= 0 && row < rows && col >= 0 && col < cols) {
//            return data[row][col];
//        } else {
//            throw new IndexOutOfBoundsException("Индекс вне границ матрицы");
//        }
//    }
//
//    // Метод для сложения матриц
//    public Matrix add(Matrix other) {
//        if (this.rows != other.rows || this.cols != other.cols) {
//            throw new IllegalArgumentException("Размеры матриц должны совпадать для сложения");
//        }
//        Matrix result = new Matrix(this.rows, this.cols);
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result.setValue(i, j, this.getValue(i, j) + other.getValue(i, j));
//            }
//        }
//        return result;
//    }
//
//    // Перегрузка метода сложения с использованием оператора "+"
//    public static Matrix add(Matrix a, Matrix b) {
//        return a.add(b);
//    }
//
//    // Метод для умножения матриц
//    public Matrix multiply(Matrix other) {
//        if (this.cols != other.rows) {
//            throw new IllegalArgumentException("Количество столбцов первой матрицы должно совпадать с количеством строк второй матрицы");
//        }
//        Matrix result = new Matrix(this.rows, other.cols);
//        for (int i = 0; i < this.rows; i++) {
//            for (int j = 0; j < other.cols; j++) {
//                double sum = 0;
//                for (int k = 0; k < this.cols; k++) {
//                    sum += this.getValue(i, k) * other.getValue(k, j);
//                }
//                result.setValue(i, j, sum);
//            }
//        }
//        return result;
//    }
//
//    // Перегрузка метода умножения с использованием оператора "*"
//    public static Matrix multiply(Matrix a, Matrix b) {
//        return a.multiply(b);
//    }
//
//    // Метод для вывода матрицы в строковом формате
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                sb.append(data[i][j]).append(" ");
//            }
//            sb.append("\n");
//        }
//        return sb.toString();
//    }
//}


//        17. Создание игры с использованием ООП
//        Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, с полями и методами, описывающими их поведение.

//// Класс для представления оружия
//class Weapon {
//    private String name;
//    private int damage;
//
//    // Конструктор
//    public Weapon(String name, int damage) {
//        this.name = name;
//        this.damage = damage;
//    }
//
//    // Получить урон оружия
//    public int getDamage() {
//        return damage;
//    }
//
//    // Получить название оружия
//    public String getName() {
//        return name;
//    }
//}
//
//// Класс для представления игрока
//class Player {
//    private String name;
//    private int health;
//    private Weapon weapon;
//
//    // Конструктор
//    public Player(String name, int health, Weapon weapon) {
//        this.name = name;
//        this.health = health;
//        this.weapon = weapon;
//    }
//
//    // Метод для атаки врага
//    public void attack(Enemy enemy) {
//        System.out.println(name + " атакует " + enemy.getName() + " с оружием " + weapon.getName());
//        enemy.takeDamage(weapon.getDamage());
//    }
//
//    // Метод для получения здоровья игрока
//    public int getHealth() {
//        return health;
//    }
//
//    // Метод для получения имени игрока
//    public String getName() {
//        return name;
//    }
//
//    // Метод для получения урона от врага
//    public void takeDamage(int damage) {
//        health -= damage;
//        System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
//    }
//}
//
//// Класс для представления врага
//class Enemy {
//    private String name;
//    private int health;
//
//    // Конструктор
//    public Enemy(String name, int health) {
//        this.name = name;
//        this.health = health;
//    }
//
//    // Метод для атаки игрока
//    public void attack(Player player) {
//        int damage = 5; // Фиксированный урон врага
//        System.out.println(name + " атакует " + player.getName());
//        player.takeDamage(damage);
//    }
//
//    // Метод для получения здоровья врага
//    public int getHealth() {
//        return health;
//    }
//
//    // Метод для получения имени врага
//    public String getName() {
//        return name;
//    }
//
//    // Метод для получения урона от игрока
//    public void takeDamage(int damage) {
//        health -= damage;
//        System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
//    }
//}

//        18. Автоматизированная система заказов
//        Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.

//// Класс для представления продукта
//class Product {
//    private String name;
//    private double price;
//
//    // Конструктор
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    // Геттеры
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//// Класс для представления клиента
//class Customer {
//    private String name;
//    private List<Order> orderHistory;
//
//    // Конструктор
//    public Customer(String name) {
//        this.name = name;
//        this.orderHistory = new ArrayList<>();
//    }
//
//    // Метод для добавления заказа в историю
//    public void addOrder(Order order) {
//        orderHistory.add(order);
//    }
//
//    // Метод для получения имени клиента
//    public String getName() {
//        return name;
//    }
//
//    // Метод для просмотра истории заказов
//    public void printOrderHistory() {
//        System.out.println("История заказов для " + name + ":");
//        for (Order order : orderHistory) {
//            System.out.println(order);
//        }
//    }
//}
//
//// Класс для представления заказа
//class Order {
//    private Customer customer;
//    private List<Product> products;
//
//    // Конструктор
//    public Order(Customer customer) {
//        this.customer = customer;
//        this.products = new ArrayList<>();
//        customer.addOrder(this); // Добавляем заказ в историю клиента
//    }
//
//    // Метод для добавления продукта в заказ
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    // Метод для расчета общей стоимости заказа
//    public double getTotalCost() {
//        double total = 0;
//        for (Product product : products) {
//            total += product.getPrice();
//        }
//        return total;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder orderDetails = new StringBuilder("Заказ от " + customer.getName() + ": ");
//        for (Product product : products) {
//            orderDetails.append(product.getName()).append(" ($").append(product.getPrice()).append("), ");
//        }
//        orderDetails.append("Итого: $").append(getTotalCost());
//        return orderDetails.toString();
//    }
//}

//        19. Наследование: Электроника
//        Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.

//// Базовый класс Device
//class Device {
//    private String brand;
//
//    // Конструктор
//    public Device(String brand) {
//        this.brand = brand;
//    }
//
//    // Метод для включения устройства
//    public void turnOn() {
//        System.out.println(brand + " device is now ON.");
//    }
//
//    // Метод для выключения устройства
//    public void turnOff() {
//        System.out.println(brand + " device is now OFF.");
//    }
//
//    // Геттер для получения бренда
//    public String getBrand() {
//        return brand;
//    }
//}
//
//// Класс Smartphone, наследующий от Device
//class Smartphone extends Device {
//    // Конструктор
//    public Smartphone(String brand) {
//        super(brand);
//    }
//
//    // Метод для съемки фотографии
//    public void takePhoto() {
//        System.out.println(getBrand() + " smartphone took a photo.");
//    }
//}
//
//// Класс Laptop, наследующий от Device
//class Laptop extends Device {
//    // Конструктор
//    public Laptop(String brand) {
//        super(brand);
//    }
//
//    // Метод для запуска приложения
//    public void runApplication(String appName) {
//        System.out.println(getBrand() + " laptop is running " + appName + ".");
//    }
//}

//        20. Игра "Крестики-нолики"
//        Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.

// Класс для представления игрового поля
//class Board {
//    private char[][] board;
//    private final int SIZE = 3;
//
//    public Board() {
//        board = new char[SIZE][SIZE];
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                board[i][j] = ' ';
//            }
//        }
//    }
//
//    public void display() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                System.out.print(board[i][j]);
//                if (j < SIZE - 1) System.out.print("|");
//            }
//            System.out.println();
//            if (i < SIZE - 1) System.out.println("-----");
//        }
//    }
//
//    public boolean makeMove(int row, int col, char symbol) {
//        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ') {
//            board[row][col] = symbol;
//            return true;
//        }
//        return false;
//    }
//
//    public boolean checkWin(char symbol) {
//        // Проверка строк и столбцов
//        for (int i = 0; i < SIZE; i++) {
//            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
//                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
//                return true;
//            }
//        }
//        // Проверка диагоналей
//        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
//                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
//    }
//
//    public boolean isFull() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (board[i][j] == ' ') {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
//
//// Класс для представления игрока
//class Player {
//    private String name;
//    private char symbol;
//
//    public Player(String name, char symbol) {
//        this.name = name;
//        this.symbol = symbol;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public char getSymbol() {
//        return symbol;
//    }
//}
//
//// Класс для управления игрой
//class Game {
//    private Board board;
//    private Player player1;
//    private Player player2;
//
//    public Game(Player player1, Player player2) {
//        this.board = new Board();
//        this.player1 = player1;
//        this.player2 = player2;
//    }
//
//    public void play() {
//        Scanner scanner = new Scanner(System.in);
//        Player currentPlayer = player1;
//
//        while (true) {
//            System.out.println("\n" + currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
//            board.display();
//
//            System.out.print("Enter row and column (0-2): ");
//            int row = scanner.nextInt();
//            int col = scanner.nextInt();
//
//            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
//                if (board.checkWin(currentPlayer.getSymbol())) {
//                    System.out.println("\n" + currentPlayer.getName() + " wins!");
//                    board.display();
//                    break;
//                } else if (board.isFull()) {
//                    System.out.println("It's a draw!");
//                    board.display();
//                    break;
//                }
//
//                // Смена игрока
//                currentPlayer = (currentPlayer == player1) ? player2 : player1;
//            } else {
//                System.out.println("Invalid move! Try again.");
//            }
//        }
//        scanner.close();
    }
}