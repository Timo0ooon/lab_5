Реализовать консольное приложение, которое реализует управление коллекцией объектов в интерактивном режиме. В коллекции необходимо хранить объекты класса HumanBeing, описание которого приведено ниже.<br/>
<br/>
Разработанная программа должна удовлетворять следующим требованиям:<br/>
<br/>
Класс, коллекцией экземпляров которого управляет программа, должен реализовывать сортировку по умолчанию.<br/>
Все требования к полям класса (указанные в виде комментариев) должны быть выполнены.<br/>
Для хранения необходимо использовать коллекцию типа java.util.Hashtable<br/>
При запуске приложения коллекция должна автоматически заполняться значениями из файла.<br/>
Имя файла должно передаваться программе с помощью: переменная окружения.<br/>
Данные должны храниться в файле в формате csv<br/>
Чтение данных из файла необходимо реализовать с помощью класса java.io.InputStreamReader<br/>
Запись данных в файл необходимо реализовать с помощью класса java.io.OutputStreamWriter<br/>
Все классы в программе должны быть задокументированы в формате javadoc.<br/>
Программа должна корректно работать с неправильными данными (ошибки пользовательского ввода, отсутсвие прав доступа к файлу и т.п.).<br/>
В интерактивном режиме программа должна поддерживать выполнение следующих команд:<br/>
<br/>
help : вывести справку по доступным командам<br/>
info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)<br/>
show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении<br/>
insert null {element} : добавить новый элемент с заданным ключом<br/>
update id {element} : обновить значение элемента коллекции, id которого равен заданному<br/>
remove_key null : удалить элемент из коллекции по его ключу<br/>
clear : очистить коллекцию<br/>
save : сохранить коллекцию в файл<br/>
execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.<br/>
exit : завершить программу (без сохранения в файл)<br/>
remove_greater {element} : удалить из коллекции все элементы, превышающие заданный<br/>
remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный<br/>
replace_if_lowe null {element} : заменить значение по ключу, если новое значение меньше старого<br/>
average_of_impact_speed : вывести среднее значение поля impactSpeed для всех элементов коллекции<br/>
min_by_has_toothpick : вывести любой объект из коллекции, значение поля hasToothpick которого является минимальным<br/>
max_by_impact_speed : вывести любой объект из коллекции, значение поля impactSpeed которого является максимальным<br/>
Формат ввода команд:<br/>
<br/>
Все аргументы команды, являющиеся стандартными типами данных (примитивные типы, классы-оболочки, String, классы для хранения дат), должны вводиться в той же строке, что и имя команды.<br/>
Все составные типы данных (объекты классов, хранящиеся в коллекции) должны вводиться по одному полю в строку.<br/>
При вводе составных типов данных пользователю должно показываться приглашение к вводу, содержащее имя поля (например, "Введите дату рождения:")<br/>
Если поле является enum'ом, то вводится имя одной из его констант (при этом список констант должен быть предварительно выведен).<br/>
При некорректном пользовательском вводе (введена строка, не являющаяся именем константы в enum'е; введена строка вместо числа; введённое число не входит в указанные границы и т.п.) должно быть показано сообщение об ошибке и предложено повторить ввод поля.<br/>
Для ввода значений null использовать пустую строку.<br/>
Поля с комментарием "Значение этого поля должно генерироваться автоматически" не должны вводиться пользователем вручную при добавлении.<br/>
Описание хранимых в коллекции классов:<br/>
<br/>
public class HumanBeing {<br/>
<tr>private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически<br/>
<tr>private String name; //Поле не может быть null, Строка не может быть пустой<br/>
<tr>private Coordinates coordinates; //Поле не может быть null<br/>
<tr>private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически<br/>
<tr>private Boolean realHero; //Поле не может быть null<br/>
<tr>private Boolean hasToothpick; //Поле не может быть null<br/>
<tr>private Double impactSpeed; //Значение поля должно быть больше -355, Поле может быть null<br/>
<tr>private WeaponType weaponType; //Поле не может быть null<br/>
<tr>private Mood mood; //Поле не может быть null<br/>
<tr>private Car car; //Поле не может быть null<br/>
}<br/>
    
public class Coordinates {<br/>
<tr>private Long x; //Поле не может быть null<br/>
<tr>private long y; //Значение поля должно быть больше -507<br/>
}<br/>

public class Car {<br/>
<tr>private String name; //Поле не может быть null<br/>
}<br/>

public enum WeaponType {<br/>
<tr>HAMMER,<br/></tr>
<tr>AXE,<br/></tr>
<tr>PISTOL,<br/></tr>
<tr>MACHINE_GUN;<br/></tr>
}<br/>

public enum Mood {<br/>
<tr>SORROW,<br/>
<tr>LONGING,<br/>
<tr>CALM,<br/>
<tr>FRENZY;<br/>
}<br/>

Отчёт по работе должен содержать:<br/>
<br/>
Текст задания.<br/>
Диаграмма классов разработанной программы.<br/>
Исходный код программы.<br/>
Выводы по работе.<br/>
Вопросы к защите лабораторной работы:<br/>
<br/>
1. Коллекции. Сортировка элементов коллекции. Интерфейсы java.util.Comparable и java.util.Comparator.<br/>
2. Категории коллекций - списки, множества. Интерфейс java.util.Map и его реализации.<br/>
3. Параметризованные типы. Создание параметризуемых классов. Wildcard-параметры.<br/>
4. Классы-оболочки. Назначение, область применения, преимущества и недостатки. Автоупаковка и автораспаковка.<br/>
5. Потоки ввода-вывода в Java. Байтовые и символьные потоки. "Цепочки" потоков (Stream Chains).<br/>
6. Работа с файлами в Java. Класс java.io.File.<br/>
7. Пакет java.nio - назначение, основные классы и интерфейсы.<br/>
8. Утилита javadoc. Особенности автоматического документирования кода в Java.<br/>
