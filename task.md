﻿Задание 2. Singleton
Класс ParserPageService реализован как Singleton, поскольку компоненты в Spring, помеченные аннотациями @service, @component, @repository, @controller по умолчанию создаются с областью видимости (scope) синглтона.
Это значит, что Spring создает единственный экземпляр такого класса и использует его в течение всего жизненного цикла приложения.
На классе ParserPageService висит аннотация @service, следовательно этот класс Singleton.


Задание 3. Prototype
Интерфейс Sheep и класс BlackSheep реализуют паттерн Prototype, потому что в их основе лежит способность клонировать объекты, создавая новые экземпляры с теми же данными, что и у исходного объекта. 
Интерфейс Sheep содержит метод clone(), который возвращает новый объект того же типа. Это ключевой элемент паттерна Prototype, так как он предполагает, что каждый класс, реализующий этот интерфейс, должен поддерживать клонирование самого себя. 
Класс BlackSheep реализует интерфейс Sheep, предоставляя собственную реализацию метода clone(). Этот метод создает и возвращает новый объект BlackSheep, копируя состояние текущего объекта.
При вызове метода clone() создается новая овца с тем же именем, что и у исходного объекта, что соответствует принципу клонирования в Prototype, где каждый объект может "создавать" копии самого себя.


Задание 4. Static Fabric Method
Класс Player представляет собой пример паттерна Static Factory Method по следующим причинам:
В классе Player есть приватный конструктор, следоватльно, прямое создание объектов через new Player() запрещено, что заставляет использовать статические методы для создания экземпляров класса, контролируя процесс их создания.
Также присутсвуют статические методы getCricketPlayer(), getFootballPlayer(), которые инкапсулируют логику создания объектов. Они возвращают готовые объекты Player с предопределёнными значениями.


Задание 5. Builder
Класс Car представляет собой пример паттерна Builder по следующим причинам:
Класс Car содержит обязательные параметры (двигатель и количество колёс) и необязательные параметры (цвет, наличие GPS и кондиционера).
Внутренний статический класс Builder отвечает за создание объекта Car, в нём задаются обязательные параметры через конструктор и опциональные через методы. 
Также есть метод build(), который возвращает готовый объект класса Car. 


Задание 6. Factory Method
В пакете Factory Method находятся классы, которые представляют собой паттерн Factory Method.
Интерфейс Animal(Продукт) определяет метод speak(), который должен реализовать каждый конкретный тип животного.
Класс Dog это конкретный продукт интерфейса Animal, который реализуют поведение метода speak().
Абстрактный класс AnimalFactory содержит абстрактный метод createAnimal(), который будет реализован в конкретных фабриках, метод createAnimal и явлется фабричным методом.
Класс DogFactory конкретный создатель, который реализуют метод createAnimal() для создания определённых видов животных.


Задание 7. Abstract Factory
В пакете AbstractFactory находятся классы, которые представляют собой паттерн Abstract Factory.
Интерфейс CarFactory определяет метод для создания абстрактного продукта Engine.
Интерфейс Engine представляет абстрактный продукт.
Конкретная Фабрика ElectricCarFactory реализует создание конкретного продукта ElectricEngine.
Конкретный продукт ElectricEngine реализует абстрактный продукт Engine.


Задание 8. Adapter
Интерфейс USBTypeC определяет метод chargeWithUSBC() предназначенный для работы с устройствами, использующими USB-C.
Адаптируемый класс класс LightningDevice имеет метод chargeWithLightning(), несовместимый с целевым интерфейсом.
Класс LightningToUSBCAdapter является адаптером, он реализует интерфейс USBTypeC, переводя вызовы chargeWithUSBC() в вызовы chargeWithLightning().
Класс LightningToUSBCAdapter наследуется от интерфейса USBTypeC, а также содержит в своем поле класс LightningDevice, который передается в конструктор.
Таким образом в классе LightningToUSBCAdapter композируется класс LightningDevice.


Задание 9. Bridge
В пакете Bridge находятся классы которые представляют собой паттерн Bridge.
Интерфейс Device ялвяется реализацией, содержит различные методы.
Класс RemoteControl представляет собой абстракцию, которая использует интерфейс Device для взаимодействия с конкретной реализацией (содержит интерфейс Device в поле).
Интерфейс Device(реализация) реализуется классами TV(конкретная реализация) и Radio(конкретная реализация), которые являются наследниками интерфейса Device.
Класс AdvancedRemoteControl представялет собой уточненную абстракцию. Таким образом, между классами RemoteControl и Device находится мост, который позволяет в классе RemoteControl использовать методы интерфейса Device.


Задание 10. Composite
В пакете Composite находятся классы, которые представляют собой паттерн Composite.
Интерфейс Graphic является компонентом, содержит метод draw().
Классы Circle и Square являются листами, реализуют интерфейс Graphic и представляют отдельные графические элементы. 
Класс CompositeGraphic является узлом реализует интерфейс Graphic и содержит список других графических объектов. Он позволяет добавлять и удалять объекты, а также реализует метод draw, который вызывает метод draw для каждого из своих дочерних объектов.


Задание 11. Decorator
В пакете Decorator находятся классы, которые представляют собой паттерн Decorator.
Интерфейс Coffee являвется компонентом, определяет общий интерфейс для всех кофейных объектов.
Класс SimpleCoffee является конкретным компонентом реализует интерфейс Coffee.
Абстрактный класс CoffeeDecorator является декоратором, реализует интерфейс Coffee и содержит ссылку на объект типа Coffee, он делегирует вызовы своему объекту.
Конкретные декораторы MilkDecorator и SugarDecorator переопределяют методы для добавления дополнительного описания и стоимости.


Задание 12. Facade
В пакете Facade находятся классы, которые представляют собой паттерн Facade.
Класс Computer является фасадом, объединяет компоненты и предоставляет простой метод startComputer(), который выполняет все необходимые шаги для запуска компьютера(использование экземпляров классов CPU, Memory, HardDrive).


Задание 13. FlyWeight
В пакете FlyWeight находятся классы, которые представляют собой паттерн FlyWeight.
Интерфейс TreeType(Легковесный интерфейс) определяет метод draw(), который должен реализовывать каждый легковесный объект.
Класс Tree(онкретный легковес) реализует интерфейс TreeType. Он хранит общее состояние (цвет и тип дерева), но не хранит уникальные данные (координаты).
Класс TreeFactory(Фабрика легковесов) управляет созданием и хранением легковесных объектов. Он проверяет, существует ли уже объект с заданными свойствами, и если да, возвращает его. Если нет — создает новый.
В Main создаем деревья с помощью фабрики. Когда запрашиваем одно и то же дерево несколько раз, фабрика возвращает уже существующий объект, что экономит память.


Задание 14. Proxy
ProxyImage управляет доступом к RealImage: реальный объект создаётся и загружается только тогда, когда это действительно необходимо (при первом вызове метода display()).
Используется ленивая загрузка: Вместо того чтобы загружать изображение сразу, прокси откладывает создание и загрузку до момента, когда они нужны. 
Скрытие реализации: клиентский код не заботится о том, как загружается реальный объект. Он работает только с интерфейсом Image, не зная о дополнительных деталях, связанных с RealImage.


Задание 15. Cnaine of responsibility
Logger - Абстрактный класс, определяющий уровень логирования и цепочку обработчиков.
ConsoleLogger и FileLogger: Конкретные обработчики, которые реализуют способ записи сообщений.
Цепочка логеров: В методе getChainOfLoggers() создаётся цепочка из логеров.
Клиент: В main методе создаётся цепочка и вызывается логирование.


Задание 16. Command
Command определяет общий метод execute(), который должны реализовать все конкретные команды.
Конкретные команды LightOnCommand и LightOffCommand реализуют интерфейс Command и содержат ссылку на объект Light. Эти классы отвечают за вызов соответствующих методов (включение и выключение света) в объекте Light.
Получатель Light представляет собой объект, который выполняет реальные действия (включение и выключение света). Эти действия определены в методах turnOn() и turnOff().
Отправитель RemoteControl содержит команду и отвечает за её выполнение. Он вызывает метод execute() у текущей команды, когда пользователь нажимает кнопку.
Main (клиент) собирает все вместе и запускает взаимодействие.


Задание 17. Interpreter
Интерфейс Expression определяет метод interpret(), который все конкретные выражения реализуют, позволяя интерпретировать выражения.
Класс Number (терминальное выражение) представляет собой число, возвращает свое значение при вызове interpret().
Класс Add (нетерминальное выражение) представляет собой операцию сложения. Он содержит ссылки на два выражения (левое и правое) и выполняет соответствующую операцию, при этом вызывает interpret() на своих компонентах.


Задание 18. Iterator
Интерфейс IterableCollection является агрегатом, а его реализация BookCollection конкретным агрегатом.
Класс BookCollection возвращает экземпляр итератора.
Итератором является интерфейс Iterator,он служит для обхода элементов коллекции.
Конкретным итератором является внутренний класс BookIterator, реализует логику обхода.
Конкретная коллекция (BookCollection) возвращает итератор через метод createIterator.
Пользователь обходит элементы, не зная о структуре данных,используя методы hasNext и next.


Задание 19. Mediator
Медиатором является интерфейс ChatMediator, конкретным медиатором: ChatRoom.
Коллегой является абстрактный класс User, а конкретным коллегой ChatUser.
Все действия, связанные с отправкой сообщений, происходят внутри ChatRoom. 
Пользователи не знают, кому именно нужно отправлять сообщения — этим управляет посредник.
Участники чата (ChatUser) вообще ничего не знают друг о друге. Они взаимодействуют исключительно через ChatRoom, что снижает связанность объектов.


Паттерн 20. Memento
класс Originator содержит состояние state, а также методы saveStateToMemento() и getStateFromMemento().
класс Memento хранит состояние объекта Originator в виде неизменяемого объекта.
класс Caretaker управляет сохраненными состояниями, предоставляя возможность выбирать нужный момент для восстановления.


Паттерн 21. Observer
интерфейс Subject (объект), реализованный в WeatherStation, управляет списком наблюдателей и их уведомлениями.
класс WeatherStation (конкретный объект) хранит состояние и оповещает наблюдателей об изменениях.
интерфейс Observer (наблюдатель), который определяет метод update() для получения уведомлений.
класс MobileDevice (конкретный наблюдатель) реализует интерфейс Observer и обрабатывает изменения состояния WeatherStation.


Паттерн 22. State 
Конкретные состояния: NoCoinState, HasCoinState, SoldState реализуют интерфейс State и определяют поведение для конкретного состояния автомата.
Контекстом является класс VendingMachine, он содержит текущее состояние и делегирует вызовы методам состояния.


Паттерн 23. Strategy
Конкретные стратегии: Addition, Subtraction, Multiplication, Division
Эти классы реализуют общий интерфейс Operation и содержат соответствующие алгоритмы.
Контекст Calculator хранит ссылку на текущую стратегию и вызывает её метод execute.
Стратегия (алгоритм) устанавливается динамически во время выполнения через метод setStrategy().


Паттерн 24. Template Method
В абстрактном классе Beverage находится шаблонный метод prepareRecipe(), в нём по порядку выполняются различные методы.
Конкретные классы Tea и Coffee расширяют класс Beverage, они предоставляют свои реализации для шага заваривания и добавления добавок.
В этих классах переопределяются только нужные нам методы.


Паттерн 25. Visitor
Интерфйес Animal с методом accept принимает visitante.
Классы Dog, Cat реализует этот интерфейс Animal. Интерфейс AnimalVisitor определяет методы для каждого типа животного. 
В классе AnimalSoundVisitor реализуются звуки для каждого животного через метод visit. 
В методе main создаются объекты животных и к ним применяется visitante, получая соответствующие звуки.

