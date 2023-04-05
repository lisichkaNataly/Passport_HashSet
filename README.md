# Passport_HashSet
паспорт - получение информации
В некоторых гос. структурах многих стран есть возможность вбить номер паспорта и получить информацию о том, кому он принадлежит.
Написана программа, которая содержит в себе упрощенный функционал этой системы.
Создан класс Passport, содержащий в себе поля:
- «Номер паспорта» (уникальное, неповторяющееся значение);
- «Фамилия»;
- «Имя»;
- «Отчество» (если имеется; может быть пустым);
- «Дата рождения».
Выбрана структуру данных, подходящую для хранения и получения (по номеру паспорта) объектов класса Passport. Реализовано 2 метода:
 - Принимает объект класса Passport и сохраняет его в коллекцию. В случае если в коллекции уже есть паспорт с данным номером, необходимо обновить остальные поля класса (фамилию, имя и т. д.)
 - Принимает номер паспорта, ищет в коллекции объект с данным номером и возвращает весь объект. Если объект не найден, возвращает null.
 - Создан класс с указанными полями.
- Переопределены методы, если это необходимо.
- Все поля не могут быть null, кроме отчества.
- Выбрана верная коллекция.
- Метод сохранения корректно добавляет и обновляет данные.
- Метод получения объекта по номеру работает согласно условиям, не бросает исключения.
