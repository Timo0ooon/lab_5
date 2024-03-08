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
2. В основе ArrayList лежит массив Object
3. ArrayList extends AbstractList implements List, RandomAccess.
4. Быстрый произвольный доступ по индексу - O(1).

Примеры объявления ArrayList:

```java
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();  // 1 способ объявления arraylist. DEFAULT_CAPACITY = 10(Вместимость), size = 0(Размер)
        list1.add("Dmitry");
        list1.add("Dimas");
        list1.add("Dimoooooooonn");

        ArrayList<DataType> list2 = new ArrayList<>();  // 2 способ объявление arraylist. DEFAULT_CAPACITY = 10(Вместимость), size = 0(Размер)
        // Если size > capacity, то будет создан новый массив, который скопирует и переместит первые элементы до size, а еще потом выделит определенное количество мест(то есть массив увеличится)
        ArrayList<DataType> list3 = new ArrayList<>(30);  // 3 способ, если заранее знаем, что длина будет равна 30. То есть внутри будет создан массив из 30 элементов(initialCapacity = 30), size = 0. 
        List<DataType> list4 = new ArrayList<>();  // 4 способ. Так можно писать, так как ArrayList реализует List.

        List list5 = new ArrayList(list1); // 5 способ. В list5 те же элементы, что и в list1, но они не ссылаются на один и тот же ArrayList(list1 != list5)

        ArrayList list6 = new ArrayList(); // 6 способ НЕЛЬЗЯ использовать! Без указания дженериков можно добавить любой тип в list6, так как по умолчанию в нем могут быть любый элементы, которые наследуются от Object. 
        list6.add("Dimas");
        list6.add(123);
        list6.add(new DataType());
        list6.add(true);
    }
}

class DataType {}
```

Методы ArrayList:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Метод add(DataType element) -> boolean, add(int index, DataType element) -> boolean - добавляет объект. 
        ArrayList<String> list = new ArrayList<>();
        list.add("Dimas");
        list.add("Dmitry");
        list.add(1, "Dimoooooooonn");  // Вторым элементов в arraylist будет Dimoooooooonn.
        list.add(1000, "Exception");  // Здесь выбросится исключение, так как размер arraylist равен 3.
        
        // Метод get(int index) - возвращает объект типа String, у которого индекс равен аргументу.
        System.out.println(list.get(0)); // Output: Dimas

        // Метод set(int index, DataType element) -> DataType - меняет старый элемент в arraylist на новый.
        list.set(1, "Dmitriy");  // Dimoooooooonn -> Dmitriy.
        list.set(2, "Dimoooooooonn");  // Dmitriy -> Dimoooooooon.

        // Метод remove(Object element) -> boolean, remove(int index) -> DataType - удаляет элемент. Смещение идет влево.
        list1.remove(0); // "Dimas" удален.
        list1.remove(8); // выбросится исключение, так как размер arraylist меньше.

        // Метод addAll(ArrayList aL) -> boolean, addAll(int index, ArrayList aL) -> boolean.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("3");
        list2.add("4");

        list1.addAll(list2);  // Output: ["1", "2", "3", "4"]
        list1.addAll(1, list2) // Output: ["1", "3", "4", "2"]

        // Метод clear() -> void
        list1.clear();  // Output: []

        // Метод indexOf(Object element) -> int
        System.out.println(list2.indexOf("3"));  // Output: 0

        // lastIndexOf(Object element) -> int
        list2.add("4");
        System.out.println(list2.lastIndexOf("4"));  // Output: 2

        // size() -> int
        System.out.println(list2.size());  // Output: 3

        // isEmpty() -> boolean
        System.out.println(list2.isEmpty());  // Output: false
        list2.clear();
        System.out.println(list2.isEmpty());  // Output: true

        // contains(Object element) -> boolean
        System.out.println(list1.contains("11231312"));  // Output: false
        list1.add("23")
        System.out.println(list1.contains("23"));  // Output: true

        // Метод toString() -> String
        // Выведет строку, но можно не использовать, так как в System.out он применится автоматически.

        // Метод Arrays.asList(DataType[] a) -> List<DataType>;
        String[] array = {"q", "w", "e", "r", "t", "y"};
        List<String> list3 = Arrays.asList(array);

        array[0] = "qwerty";
        System.out.println(list3);  // Output: ["qwerty", "w", "e", "r", "t", "y"]

        // Метод removeAll(Collection<?> c) -> boolean
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Dimas");
        list4.add("Dimoooooooonn");
        list4.add("Dmitriy");


        ArrayList<String> list5 = new ArrayList<>();
        list5.add("Dimas");
        list5.add("Dimoooooooonn");

        list4.removeAll(list5);
        System.out.println(list4);  // Output: ["Dmitriy"]

        // Метод retainAll(Collection<?> c) -> boolean
        list4.add("Dimas");
        list4.add("Dimoooooooonn");
        
        list4.retainAll(list5);
        System.out.println(list4);  // Output: ["Dimas", "Dimoooooooonn"]

        // Метод containsAll(Collection<?> c) -> boolean
        System.out.println(list4.containsAll(list5));  // Output: true

        // Метод subList(int fromIndex, int toIndex) -> List<E>
        list4.add("Dmitriy");
        System.out.println(list4.subList(0, 2));  // Output: ["Dimas", "Dimoooooooonn"]

        // toArray() -> Object[] - переведет в массив.

        // toArray(T[] a) -> T[]
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = array1.toArray(new String[0]);  // Вместо 0 можно использовать любое число. 
        System.out.println(Arrays.toString(array2));  // Output: [1, 2, 3, 4, 5, 6, 7]

        // List.of(E ...) -> List<E>
        List<Integer> list6 = List.of(1, 2, 3, 4, 5);  // Неизменяемый List
        list6.add(12);  // Выбросится исключение
        
        // List.copyOf(Collection) -> List<E>
       
       

    }
}
```

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
* Может содержать null
* not synchronized
* Нужно переопределить equals и hashCode

Методы:
* add
* remove
* size
* isEmpty
* contains

Операции:
* addAll - объединение
* retainAll - пересечение
* removeAll - разность множеств

#### HashSet
* В основе лежит HashMap
* не запоминает порядок добавления
* Ключи - это элементы HashMap, значения - константа-заглушка

#### TreeSet
* В основе содержит TreeMap
* Хранит все элементы в отсортировоном порядке
* не хранит null
* Нужно переопределить Comparable<T>
* Или указать в качестве аргумента TreeMap объект анонимного класса Comparator<T>

Методы:
* first()
* last()
* headSet(T type) - выведит все объекты, которые меньше type
* tailSet(T type) - выведит все объекты, которые больше type
* subSet(type T, type T1) - выведит подмножество между двумя объектами

#### LinkedHashSet
* наследник HashSet
* запоминает порядок добавления

<br/>
<br/>
<br/>

#### Интерфейс Map<K, V> - отображение пары "ключ-значение"
* Ассоциативный массив, отображение, словарь.
* Два параметра типа.
* Ключи уникальные, значения - любые.
* Методы: V put(K key, V value), V get(K key), V remove(K key)...

#### Хеш-таблица HashMap
* [Работа HashMap](https://www.youtube.com/watch?v=0UX4MIfOMEs&t=235s&ab_channel=%D0%9D%D0%B8%D0%BA%D0%BE%D0%BB%D0%B0%D0%B9%D0%A2%D1%83%D0%B7%D0%BE%D0%B2%E2%80%94Golang)
* [Еще про HashMap](https://www.youtube.com/watch?v=kVeib6glUoc&ab_channel=%D0%9F%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%B0%D0%BD%D0%B8%D1%8F)
* Ассоциативный массив на основе хеш-таблицы
* bucket = key.hashcode() % N
* Нужен метод hashCode() и equals() у элементов
* Обход элементов - в полном беспорядке
* Ключи элементов должны быть уникальными. Ключ может быть null
* Значения элементов могут повторяться. Значения могут быть null.

Методы:
* put(K key, V value) - добавляет новый элемент по ключу.
* putIfAbsent(K key, V value) - добавляет элемент в коллекцию, если такого элемента нету.
* get(K key) - выводит значение по ключу. Если ключа нету, выведится null.
* remove(K key) - удаляет значение по ключу.
* containsValue(V value) - проверяет, есть ли значение в коллекции.
* containsKey(K key) - проверяет, есть ли ключ в коллекции.
* keySet() - возвращает множество ключей.
* values() - множество значений HashMap.
* entrySet() - ...

#### TreeMap
* хранит ключи в отсортированном виде
* в основе лежит красно-черное дерево
* Методы работают быстро, но не быстрее HashMap
* Если в качестве ключа идут объекты, то нужно, чтобы они реализовали интерфейс Comparable<T>
* Если не реализован, то можно в качестве аргумента TreeMap вставить объект анонимного класса Comparator<T>
* Нет необходимости переопределять hashCode() и equals()

Методы:
* descendingMap() - ставит порядок ключей по убыванию
* tailMap(K fromKey) - выведит все значения, ключи которых больше fromKey
* headMap(K fromKey) - выведит все значения, ключ которых меньше fromKey
* lastEntry() - выводит последний элемент TreeMap
* firstEntry()

#### SequencedMap + LinkedHashMap
* Упорядоченность
* HashMap + связный список
* Получение элементов в порядке добавления


<br/>
<br/>
<br/>
#### Queue
* принцип LIFO
* очередь

Методы(LinkedList):
* add(T type) - добавляет элемент в конец очереди
* offer(T type) - тоже добавляет, но не выбрасывает исключение, когда коллекция заполнена
* remove() - удаляет первый элемент
* poll() - удаляет первый элемент, но не вырбрасывает исключение, когда коллекция пуста
* element() - возвращает первый элемент
* peek() - возвращает первый элемент, но не выбрасывает исключение

### 3. Параметризованные типы. Создание параметризуемых классов. Wildcard-параметры.
Дженерики (обобщения) — это особые средства языка Java для реализации обобщённого программирования: особого подхода к описанию данных и алгоритмов, позволяющего работать с различными типами данных без изменения их описания.

#### Примеры использования параметризуемых классов:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Test<Integer> values = new Test<>();
        for (int i = 0; i < 10; i++) {
            values.add(i);  
        }
        values.get_values();  // Output: 0 1 2 3 4 5 6 7 8 9

        System.out.println();
        Test<Double> values_1 = new Test<>();
        for (double i = 0.2d; i < 10d; i++) {
            values_1.add(i);   
        }
        values_1.get_values();  // Output: 0.2 1.2 2.2 3.2 4.2 5.2 6.2 7.2 8.2 9.2 
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

### 4. Классы-оболочки. Назначение, область применения, преимущества и недостатки. Автоупаковка и автораспаковка.

Классы-оболочки в Java представляют собой классы, которые инкапсулируют примитивные типы данных (например, int, double, boolean и т.д.) и предоставляют дополнительные методы и функциональность для работы с этими типами данных. Ниже приведены основные аспекты классов-оболочек:<br/>

1. **Назначение и область применения**:
   * Классы-оболочки используются для работы с примитивными типами данных в контексте объектно-ориентированного программирования.
   * Они позволяют примитивным типам быть использованными в качестве объектов и передаваться как параметры в методы, которые ожидают объекты.
   * Классы-оболочки также предоставляют различные методы для работы с данными, такие как преобразование типов, сравнение и т.д.

2. **Преимущества**:
   * Объекты классов-оболочек могут быть использованы в коллекциях (например, ArrayList) и других структурах данных, которые требуют объектов.
   * Предоставляют удобные методы для работы с данными, что может упростить код и сделать его более читаемым.
   * Позволяют работать с примитивными типами данных как с объектами, что упрощает некоторые операции.

3. **Недостатки**:
   * Использование классов-оболочек может увеличить потребление памяти и замедлить производительность программы из-за создания дополнительных объектов.
   * Некоторые операции с классами-оболочками могут быть менее эффективными по сравнению с работой непосредственно с примитивными типами данных.

4. **Автоупаковка и автораспаковка**:
   * Автоупаковка (autoboxing) - это автоматическое преобразование примитивного типа данных в соответствующий объект класса-оболочки.
   * Автораспаковка (unboxing) - это автоматическое преобразование объекта класса-оболочки обратно в примитивный тип данных.
   
Пример использования автоупаковки и автораспаковки:
```java
Integer num = 10; // Автоупаковка int в Integer
int value = num; // Автораспаковка Integer в int
```

В целом, классы-оболочки предоставляют удобные инструменты для работы с примитивными типами данных в Java, но их использование требует осторожности из-за потенциальных недостатков, связанных с производительностью и использованием памяти.

### 5. Потоки ввода-вывода в Java. Байтовые и символьные потоки. "Цепочки" потоков (Stream Chains).

Потоки ввода-вывода (I/O streams) в Java представляют собой механизм для передачи данных между программой и внешними устройствами, такими как файлы, сетевые соединения, консоль и т.д. Потоки в Java делятся на байтовые (byte streams) и символьные (character streams).

1. **Байтовые потоки**:
   * Байтовые потоки работают с отдельными байтами данных.
   * Они представлены интерфейсами, которые имеют в названии слово InputStream или OutputStream.
   * Примеры байтовых потоков: FileInputStream, FileOutputStream, BufferedInputStream, BufferedOutputStream и другие.

2. **Символьные потоки**:
   * Символьные потоки работают с символами Unicode.
   * Они представлены классами, которые имеют в названии слово Reader или Writer.
   * Символьные потоки обычно используются для работы с текстовыми данными.
   * Примеры символьных потоков: FileReader, FileWriter, BufferedReader, BufferedWriter и другие.

3. **"Цепочки" потоков (Stream Chains)**:
   * "Цепочки" потоков позволяют объединять несколько потоков ввода-вывода для выполнения последовательности операций.
   * Это достигается путем создания "оберток" над существующими потоками.
   * Например, можно создать буферизированный символьный поток для чтения из файла следующим образом:
          BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
   * В данном случае, BufferedReader является "оберткой" над потоком чтения из файла (FileReader), что позволяет читать данные из файла более эффективно.

Использование "цепочек" потоков позволяет улучшить производительность и эффективность работы с данными, а также обеспечивает удобство при работе с различными типами потоков. Важно помнить о правильном закрытии потоков после использования для избежания утечек ресурсов.

### 6. Работа с файлами в Java. Класс java.io.File.

Класс java.io.File в Java представляет собой абстракцию файловой системы и позволяет работать с файлами и директориями. С помощью этого класса можно создавать, удалять, перемещать файлы, а также получать информацию о файлах, такую как путь, размер, доступность и другие атрибуты.

Вот некоторые основные методы класса File:

1. **Создание объекта File**:
   * File file = new File("path/to/file.txt"); - создает объект File для файла по указанному пути.
   * File directory = new File("path/to/directory"); - создает объект File для директории по указанному пути.

2. **Получение информации о файле**:
   * file.exists() - проверяет существование файла.
   * file.isFile() - проверяет, является ли объект файлом.
   * file.isDirectory() - проверяет, является ли объект директорией.
   * file.getName() - возвращает имя файла или директории.
   * file.getPath() - возвращает путь к файлу или директории.

3. **Операции с файлами**:
   * file.createNewFile() - создает новый файл.
   * file.delete() - удаляет файл или директорию.
   * file.renameTo(newName) - переименовывает файл или директорию.

4. **Работа с содержимым файла**:
   * Для чтения из файла используйте потоки ввода (например, FileInputStream, BufferedReader).
   * Для записи в файл используйте потоки вывода (например, FileOutputStream, BufferedWriter).

Пример использования класса File для чтения содержимого файла:

``` java
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Этот пример открывает файл "example.txt", читает его содержимое построчно и выводит на консоль. После завершения работы с файлом необходимо закрыть потоки для освобождения ресурсов.

### 7. Пакет java.nio - назначение, основные классы и интерфейсы.

Пакет java.nio (New I/O) в Java предоставляет новый, более эффективный и гибкий способ работы с вводом-выводом (I/O) данных. Он был введен в Java 1.4 и предоставляет мощные классы и интерфейсы для работы с каналами, селекторами, буферами и другими сущностями, улучшающими производительность и масштабируемость операций ввода-вывода.

Вот некоторые основные классы и интерфейсы из пакета java.nio:

1. **Каналы (Channels)**:
   * Channel - интерфейс, представляющий двусторонний канал для передачи данных.
   * FileChannel - класс, предоставляющий канал для работы с файлами.
   * SocketChannel, ServerSocketChannel, DatagramChannel - классы для работы с сетевыми каналами.

2. **Буферы (Buffers)**:
   - Buffer - абстрактный класс, представляющий буфер для хранения данных.
   - ByteBuffer, CharBuffer, IntBuffer, FloatBuffer, DoubleBuffer, ShortBuffer, LongBuffer - конкретные реализации буферов для различных типов данных.

3. **Селекторы (Selectors)**:
   * Selector - интерфейс, представляющий механизм мультиплексирования каналов.
   * SelectableChannel - абстрактный класс, представляющий канал, который можно использовать с селектором.
   * SelectionKey - класс, представляющий ключ выбора, связанный с каналом и селектором.

4. **Другие классы**:
   * Path - класс, представляющий путь к файлу или директории.
   * Files - класс, предоставляющий удобные методы для работы с файлами и директориями.
   * StandardOpenOption - перечисление опций для открытия файлов.

Пакет java.nio предоставляет более гибкие и эффективные способы работы с данными, особенно при работе с большими объемами данных или при работе с сетевым вводом-выводом. Он используется в различных областях разработки, таких как сетевое программирование, обработка файлов, обработка данных в памяти и другие задачи, требующие эффективной работы с данными.

### 8. Утилита javadoc. Особенности автоматического документирования кода в Java.

Утилита javadoc в Java предназначена для автоматического создания документации на основе комментариев в исходном коде. Она позволяет генерировать HTML-страницы с описанием классов, методов, полей и других элементов программы, что делает код более понятным и удобным для использования другими разработчиками.

Вот некоторые особенности автоматического документирования кода с помощью javadoc:

1. **Комментарии в формате Javadoc**: Для того чтобы javadoc корректно обработал комментарии, они должны быть написаны в определенном формате. Комментарии начинаются с /**, а не просто /*, и содержат специальные теги для описания различных аспектов кода, таких как @param, @return, @throws и другие.

2. **Генерация HTML-страниц**: После запуска утилиты javadoc на исходных файлах Java, она анализирует комментарии и генерирует HTML-страницы документации. Эти страницы содержат информацию о классах, методах, полях, параметрах и возвращаемых значениях, а также описания и примеры использования.

3. **Создание связей между элементами**: javadoc создает ссылки между различными элементами программы, такими как классы, методы и поля. Это позволяет легко перемещаться по документации и быстро находить нужную информацию.

4. **Поддержка пользовательских тегов**: Вы можете создавать собственные теги для документирования специфических аспектов вашего кода. Например, вы можете добавить тег @author для указания автора класса или метода.

5. **Интеграция с IDE**: Многие современные интегрированные среды разработки (IDE), такие как IntelliJ IDEA, Eclipse и NetBeans, поддерживают автоматическую генерацию документации с помощью javadoc. Вы можете вызвать javadoc прямо из IDE и просмотреть сгенерированную документацию без необходимости запуска утилиты вручную.

Использование утилиты javadoc помогает создать чистый и понятный код, который легко читать и поддерживать. Документация, сгенерированная javadoc, является важной частью разработки программного обеспечения и помогает другим разработчикам быстро понять ваш код и эффективно работать с ним.





