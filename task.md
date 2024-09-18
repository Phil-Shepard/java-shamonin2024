Задание 2.Singleton
Класс ParserPageService реализован как Singleton, поскольку компоненты в Spring, помеченные аннотациями @service, @component, @repository, @controller по умолчанию создаются с областью видимости (scope) синглтона.
Это значит, что Spring создает единственный экземпляр такого класса и использует его в течение всего жизненного цикла приложения.
На классе ParserPageService висит аннотация @service, следовательно этот класс Singleton.
