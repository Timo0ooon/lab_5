# 5 Лабораторная работа. 
* *Реализовать консольное приложение, которое реализует управление коллекцией объектов в интерактивном режиме. В коллекции необходимо хранить объекты класса HumanBeing, описание которого приведено ниже.*<br/>
 
***Разработанная программа должна удовлетворять следующим требованиям:***<br/>
* Класс, коллекцией экземпляров которого управляет программа, должен реализовывать сортировку по умолчанию.<br/>
* Все требования к полям класса (указанные в виде комментариев) должны быть выполнены.<br/>
* Для хранения необходимо использовать коллекцию типа java.util.Hashtable<br/>
* При запуске приложения коллекция должна автоматически заполняться значениями из файла.<br/>
* Имя файла должно передаваться программе с помощью: переменная окружения.<br/>
* Данные должны храниться в файле в формате csv.<br/>
* Чтение данных из файла необходимо реализовать с помощью класса java.io.InputStreamReader.<br/>
* Запись данных в файл необходимо реализовать с помощью класса java.io.OutputStreamWriter.<br/>
* Все классы в программе должны быть задокументированы в формате javadoc.<br/>
* Программа должна корректно работать с неправильными данными (ошибки пользовательского ввода, отсутсвие прав доступа к файлу и т.п.).<br/>

***В интерактивном режиме программа должна поддерживать выполнение следующих команд:***<br/>
* help : вывести справку по доступным командам.<br/>
* info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.).<br/>
* show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении.<br/>
* insert null {element} : добавить новый элемент с заданным ключом.<br/>
* update id {element} : обновить значение элемента коллекции, id которого равен заданному.<br/>
* remove_key null : удалить элемент из коллекции по его ключу.<br/>
* clear : очистить коллекцию.<br/>
* save : сохранить коллекцию в файл.<br/>
* execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.<br/>
* exit : завершить программу (без сохранения в файл).<br/>
* remove_greater {element} : удалить из коллекции все элементы, превышающие заданный.<br/>
* remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный.<br/>
* replace_if_lowe null {element} : заменить значение по ключу, если новое значение меньше старого.<br/>
* average_of_impact_speed : вывести среднее значение поля impactSpeed для всех элементов коллекции.<br/>
* min_by_has_toothpick : вывести любой объект из коллекции, значение поля hasToothpick которого является минимальным.<br/>
* max_by_impact_speed : вывести любой объект из коллекции, значение поля impactSpeed которого является максимальным.<br/>

***Формат ввода команд:***<br/>

* Все аргументы команды, являющиеся стандартными типами данных (примитивные типы, классы-оболочки, String, классы для хранения дат), должны вводиться в той же строке, что и имя команды.<br/>
* Все составные типы данных (объекты классов, хранящиеся в коллекции) должны вводиться по одному полю в строку.<br/>
* При вводе составных типов данных пользователю должно показываться приглашение к вводу, содержащее имя поля (например, "Введите дату рождения:").<br/>
* Если поле является enum'ом, то вводится имя одной из его констант (при этом список констант должен быть предварительно выведен).<br/>
* При некорректном пользовательском вводе (введена строка, не являющаяся именем константы в enum'е; введена строка вместо числа; введённое число не входит в указанные границы и т.п.) должно быть показано сообщение об ошибке и предложено повторить ввод поля.<br/>
* Для ввода значений null использовать пустую строку.<br/>
* Поля с комментарием "Значение этого поля должно генерироваться автоматически" не должны вводиться пользователем вручную при добавлении.<br/>

***Описание хранимых в коллекции классов:***<br/>
```java
public class HumanBeing {
    private long id;  // Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name;  // Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates;  // Поле не может быть null
    private java.time.ZonedDateTime creationDate;  // Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Boolean realHero;  // Поле не может быть null
    private Boolean hasToothpick;  // Поле не может быть null
    private Double impactSpeed;  // Значение поля должно быть больше -355, Поле может быть null
    private WeaponType weaponType;  // Поле не может быть null
    private Mood mood;  // Поле не может быть null
    private Car car;  // Поле не может быть null
}
public class Coordinates {
    private Long x;  // Поле не может быть null
    private long y;  // Значение поля должно быть больше -507
}
public class Car {
    private String name;  // Поле не может быть null
}
public enum WeaponType {
    HAMMER,
    AXE,
    PISTOL,
    MACHINE_GUN;
}
public enum Mood {
    SORROW,
    LONGING,
    CALM,
    FRENZY;
}
```

***Отчёт по работе должен содержать:***<br/>
* Текст задания.<br/>
* Диаграмма классов разработанной программы.<br/>
* Исходный код программы.<br/>
* Выводы по работе.<br/>

***Вопросы к защите лабораторной работы:***<br/>
* Коллекции. Сортировка элементов коллекции. Интерфейсы java.util.Comparable и java.util.Comparator.<br/>
* Категории коллекций - списки, множества. Интерфейс java.util.Map и его реализации.<br/>
* Параметризованные типы. Создание параметризуемых классов. Wildcard-параметры.<br/>
* Классы-оболочки. Назначение, область применения, преимущества и недостатки. Автоупаковка и автораспаковка.<br/>
* Потоки ввода-вывода в Java. Байтовые и символьные потоки. "Цепочки" потоков (Stream Chains).<br/>
* Работа с файлами в Java. Класс java.io.File.<br/>
* Пакет java.nio - назначение, основные классы и интерфейсы.<br/>
* Утилита javadoc. Особенности автоматического документирования кода в Java.<br/>

# Теория:

### 1. Коллекции. Сортировка элементов коллекции. Интерфейсы java.util.Comparable и java.util.Comparator.
Коллекции — общее название для нескольких структур данных в Java. Данные можно хранить многими разными способами.<br/>

Несколько методов интерфейса Collection:
* boolean add(E e);  // Результат - элемент есть в коллекции. true - коллекция изменилась
* boolean remove (Object o);  // результат - элемента нет в коллекции. true - коллекция изменилась 
* boolean contains (Object o);  // true - элемент есть, коллекции нет.
* int size();  // Количество элементов в коллекции.

#### Иеархия коллекций в Java.
![Иеархия коллекций](https://avatars.dzeninfra.ru/get-zen_doc/271828/pub_6516c28dbfb075386a6d92a8_6516c44e0fa30450b9854f64/scale_1200)

#### Сортировка элементов коллекции.
* Если нужно отсортировать коллекцию, то нужно применить метод Collections.sort()<br/>
* Если нужно отсортировать массив, то нужно применить метод Arrays.sort()<br/>

#### Интерфейсы java.util.Comparable и java.util.Comparator.
Comparable — это интерфейс, входящий в пакет java.lang и используемый для сортировки классов на основе их естественного порядка. Интерфейс Comparable должен быть реализован в классе, который будет использоваться для сортировки. Этот класс можно сортировать на основе отдельных атрибутов, таких как идентификатор, имя, отдел и так далее.<br/>
<br/>
Класс, реализующий интерфейс Comparable, сравнивает себя с другими объектами. Реализованный класс предлагает пользовательскую реализацию int CompareTo(T var1) для пользовательской сортировки.<br/>
<br/>
Метод int CompareTo(T var1) должен быть переопределен таким образом, чтобы:<br/>
1. Он должен возвращать целое положительное значение Positive(>0), если этот объект больше объекта сравнения.<br/>
2. Он должен возвращать целое отрицательное значение Negative(<0), если этот объект меньше объекта сравнения.<br/>
3. Он должен вернуть Zero(=0), если этот и сравниваемый объект равны.<br/>

При использовании класса Comparable можно сортировать только по одному атрибуту. Вот пример применения Comparable: <br/>

```java
class Employee implements Comparable<Employee>{
    public final Integer id;
    public final String name;
    public final String surname;
    public int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void set_new_salary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " " + surname + " " + id + " " + salary;
    }

    // 1 способ реализации
    @Override
    public int compareTo(Employee anotheremployee) {
        if (this.id > anotheremployee.id)
            return 1;
        else if (this.id < anotheremployee.id)
            return -1;
        return 0;
    }
    

    // 2 способ реализации
    /*
    @Override
    public int compareTo(Employee anotheremployee) {
        return this.id - anotheremployee.id;
    }
    */

    // 3 способ способ реализации
    // Integer имплементирует Comparable
    // String имплементирует Comparable
    /*
    @Override
    public int compareTo(Employee anotheremployee) {
        return this.id.compareTo(anotheremployee.id);
    }
    */

    // 4 способ по сортировке имени, но если имена совпадают, то по фамилиям. Лучше использовать интерфейс Comparator.
    /*
    @Override
    public int compareTo(Employee anotheremployee) {
        int res = this.name.compareTo(anotheremployee.name);
        if (res == 0)
            return this.surname.compareTo(anotheremployee.surname);

        return res;
    */
    }

    @Override
    public String toString() {
        return "Employee: " + name + " " + surname + " " + id + " " + salary;
    }
}
```

Comparator — это интерфейс, входящий в пакет java.util, который также используется для сортировки коллекций в Java. В отличие от Comparable, интерфейс Comparator не обязательно должен быть реализован в исходном классе, его можно реализовать и в отдельном классе.<br/>

Используя Comparator, мы можем сортировать список на основе различных атрибутов в соответствии с нашими требованиями. В компараторе два объекта передаются в метод сравнения и сравниваются друг с другом. Метод int Compare(T var1, T var2) должен быть реализован пользовательским классом компаратора.<br/>

Метод int Compare(T var1, T var2) должен быть переопределен таким образом, чтобы:<br/>
1. Он должен возвращать целое число положительное значение Positive(+ve), если первый объект больше второго объекта.<br/>
2. Он должен возвращать целое отрицательное значение Negative(-ve), если первый объект меньше второго объекта.<br/>
3. Он должен возвращать Zero(0), если оба объекта равны.<br/>

Пример использования Comparator:<br/>

```java
class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id.compareTo(emp2.id);
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}
```

Пример использования сортировки по умолчанию и своей сортировки: 

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
         Employee employee_3 = new Employee(3, "Dimas3", "Solovev", 100000);
         Employee employee_1 = new Employee(1, "Dimas1", "Solovev", 300000);
         Employee employee_2 = new Employee(2, "Dimas2", "Solovev", 500000);

         List<Employee> list = Arrays.asList(employee_3, employee_1, employee_2);

         Collections.sort(list);  // Comparable
         System.out.println(list);  // Output: [Employee: Dimas1 Solovev 1 100000, Employee: Dimas2 Solovev 2 200000, Employee: Dimas3 Solovev 3 300000]

         Collections.sort(list, new SalaryComparator());  // Comparator 
         System.out.println(list);  // Output: [Employee: Dimas3 Solovev 3 100000, Employee: Dimas2 Solovev 2 300000, Employee: Dimas1 Solovev 1 500000]
    }
}
```

### 2. Категории коллекций - списки, множества. Интерфейс java.util.Map и его реализации.<br/>

#### Интерфейс List<E> - индексированный список
* Индекс от 0 до N
* E get(int index);
* E set(int index, E e);
* void add(int index, E e);
* E remove(int index);

#### Динамический массив ArrayList 
1. Реализация списка (list) на основе массива (array).
2. ArrayList extends AbstractList implements List, RandomAccess.
3. Быстрый произвольный доступ по индексу - O(1).

#### Двусвязный список LinkedList
1. Реализация на основе двусвязного списка.
2. LinkedList extends AbstractSequentialList implements List.
3. Последовательный доступ к элементам - O(n).
4. Быстрое добавление и удаление - O(1).

#### Еще списки
1. Vector - потокобезопасный, но устаревший ArrayList.
2. Stack - устаревшая реализация на базе вектора.
3. CopyOnWriteArrayList - новая копия при каждом изменении.

<br/>
<br/>
<br/>

#### Интерфейс Set<E> - множество уникальных значений
* Методы как у Collection.
* Массовые операции - объединение, пересечение, разность множеств.
* Реализации - как у Map

<br/>
<br/>
<br/>

#### Интерфейс Map<K, V> - отображение пары "ключ-значение"
* Ассоциативный массив, отображение, словарь.
* Два параметра типа.
* Ключи уникальные, значения - любые.
* Методы: V put(K key, V value), V get(K key), V remove(K key)...

#### Хеш-таблица HashMap
* Ассоциативный массив на основе хеш-таблицы
* bucket = key.hashcode() % N
* Нужен метод hashCode() у элементов
* Обход элементов - в полном беспорядке

#### SequencedMap + LinkedHashMap
* Упорядоченность
* HashMap + связный список
* Получение элементов в порядке добавления

### 3. Параметризованные типы. Создание параметризуемых классов. Wildcard-параметры.
Дженерики (обобщения) — это особые средства языка Java для реализации обобщённого программирования: особого подхода к описанию данных и алгоритмов, позволяющего работать с различными типами данных без изменения их описания.

#### Примеры использования параметризуемых классов:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Test<Integer> values = new Test<>();
        for (int i = 0; i < 10; i++) {
            values.add(i);  // Output: 0 1 2 3 4 5 6 7 8 9
        }
        values.get_values();

        System.out.println();
        Test<Double> values_1 = new Test<>();
        for (double i = 0.2d; i < 10d; i++) {
            values_1.add(i);  // Output: 0.2 1.2 2.2 3.2 4.2 5.2 6.2 7.2 8.2 9.2 
        }
        values_1.get_values();
    }
}


class Test<T extends Number> { // ограничение типов.
    private final List<T> values = new ArrayList<>();

    public void add(T value) {
        values.add(value);
    }

    public void get_values() {
        for(T value: values) {
            System.out.print(value + " ");
        }
    }
}
```

#### Примеры использования параметризации методов:
``` java
import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        int length = 100;
        for (int i = 0; i < length; i += 10 ) {
            data.add(i);
        }
        Integer value = GenMethod.getSecondElement(data);
        System.out.println(value);  // Output: 10
    }

}

class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> values) {  // Generics в методе
        return values.get(1);
    }
}

```

#### Wildcard - параметры

Wildcard (дословно "джокер", "подстановочный знак") - это механизм в языке программирования Java, который позволяет создавать гибкие и универсальные типы данных. Wildcard параметры используются в обобщенных типах (generics) для обеспечения более широкой гибкости при работе с коллекциями и другими структурами данных.

В Java wildcard параметры обозначаются символом вопросительного знака ?. Существует несколько видов wildcard параметров:

1. ? - неограниченный wildcard: представляет любой тип данных.
2. ? extends T - ограниченный wildcard с верхней границей: представляет любой тип данных, который является подтипом класса T или самим классом T.
3. ? super T - ограниченный wildcard с нижней границей: представляет любой тип данных, который является супертипом класса T или самим классом T.

Wildcards позволяют создавать более гибкие и безопасные обобщенные типы, которые могут работать с различными типами данных. Они часто используются в методах, которые требуют передачи коллекций с неизвестными типами, или при работе с коллекциями, содержащими элементы различных типов.
