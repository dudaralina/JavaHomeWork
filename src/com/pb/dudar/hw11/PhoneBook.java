package com.pb.dudar.hw11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

    public class PhoneBook {
        public static void main(String[] args) throws Exception {
            String act;
            Scanner scan = new Scanner(System.in);
            HashMap<String, Person> numbers = new HashMap<>();

            ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            Map <String , Person> mapa = new HashMap<>();
            mapa.putAll(numbers);

            numbers.put("Алина", (new Person("Дударь Алина Андреевна", "0672040027", LocalDate.of(1995, 3, 10), "address2")));
            numbers.put("Богдан", (new Person("Савош Богдан Александрович", "0662550610", LocalDate.of(1992, 8, 25), "address1")));
            numbers.put("Мария", (new Person("Кутина Мария Вадимовна", "0665556665", LocalDate.of(1992, 12, 8), "address3")));


            System.out.println("Команды:\n" +
                    "add - Добавить новый контакт;" + "\n" +
                    "remove - Удалить контакт;" + "\n" +
                    "sortname - Сортировка по имени;\n" +
                    "sortlastname - Сортировка по фамилии;" + "\n" +
                    "search - Поиск контакта;" + "\n" +
                    "edit - Редактирование контакта;" + "\n" +
                    "exit - Выход;\n" +
                    "save - Сохранить в файл;\n" +
                    "read - Загрузить файл контактов.\n" +
                    "==================================\n");

            System.out.println("Контакты:\n");
            for (Map.Entry num : numbers.entrySet()) {
                System.out.println(num.getKey());
            }

            System.out.println("\nВыберите действие:");
            act = scan.nextLine();

            while (!act.equals("exit")) {

                // добавление контакта
                if (act.equals("add")) {
                    System.out.print("ДОБАВЛЕНИЕ КОНТАКТА \n" +
                            "Введите имя: ");
                    String add = scan.nextLine();
                    System.out.print("Номер телефона:");
                    String phone = scan.nextLine();
                    Person person = new Person(phone);
                    numbers.put(add, person);
                    System.out.println("Добавлено! Что делаем дальше?");

                    // удаление контакта
                } else if (act.equals("remove")) {
                    System.out.print("УДАЛЕНИЕ КОНТАКТА \n" +
                            "Кого хотите удалить? Введите имя: ");
                    String remove = scan.nextLine();
                    numbers.remove(remove);
                    System.out.println("Удалено! Что делаем дальше?");

                    // сортировка по имени
                } else if (act.equals("sortname")) {
                    TreeMap<String, Person> sortname = new TreeMap<>(numbers);
                    System.out.println("Контакты:\n");
                    for (Map.Entry num : sortname.entrySet()) {
                        System.out.println(num.getKey());
                    }
                    System.out.print("\nЖелаете продолжить? Введите действие: ");

                    // сортировка по фамилии
                } else if (act.equals("sortlastname")) {
                    personList(numbers);

                    System.out.println("\nЖелаете продолжить? Введите действие: ");
                    // редактирование контакта
                } else if (act.equals("edit")) {

                    System.out.print("РЕДАКТИРОВАНИЕ КОНТАКТА: \n" +
                            "Имя контакта для редактирования: ");
                    String edit = scan.nextLine();
                    System.out.print("Что редактируем (phone, name, address, birth) ? ");
                    String actEdit = scan.nextLine();
                    Person personEdit = numbers.get(edit);
                    switch (actEdit) {
                        case "phone":
                            System.out.print("Новый номер: ");
                            String phone = scan.nextLine();
                            personEdit.setPhone(phone);
                            System.out.println("Время редактирования: " + personEdit.getTime() +
                                    "\n Изменено! Что делаем дальше?");
                            break;
                        case "name":
                            System.out.print("Новое ФИО: ");
                            String name = scan.nextLine();
                            personEdit.setName(name);
                            System.out.println("Время редактирования: " + personEdit.getTime() +
                                    "\n Изменено! Что делаем дальше?");
                            break;
                        case "address":
                            System.out.print("Новый адрес: ");
                            String address = scan.nextLine();
                            personEdit.setAddress(address);
                            System.out.println("Время редактирования: " + personEdit.getTime() +
                                    "\n Изменено! Что делаем дальше?");
                            break;
                        case "birth":
                            System.out.print("Дата рождения (формат даты YYYY-MM-DD): ");
                            String birth = scan.nextLine();
                            personEdit.setBirth(LocalDate.parse(birth));
                            System.out.print("Время редактирования: " + personEdit.getTime() +
                                    "\n Изменено! Что делаем дальше?");
                    }
                }

                // поиск контакта
                else if (act.equals("search")) {
                    System.out.print("Имя контакта:");
                    String search = scan.nextLine();
                    System.out.println(numbers.get(search));
                    System.out.println("Введите действие: ");
                    }
                else if (act.equals("alldata")) {
                    System.out.println("Контакты:\n");
                    for (Map.Entry num : numbers.entrySet()) {
                        System.out.print("\n" + num.getKey() + "\nДетали: " + num.getValue());
                    }

                } else if (act.equals("save")) {
                    objectMapper.writeValue(new File("files\\numbers.json"), mapa);
                    System.out.println("Контакты сохранены!");
                } else if (act.equals("read")) {
                    HashMap<String, Person> numbersnew = objectMapper.readValue(new File("files\\numbers.json"), new TypeReference<HashMap<String, Person>>() {
                    });
                    numbers.putAll(numbersnew);
                    System.out.println("Контакты:\n");
                    for (Map.Entry num : numbersnew.entrySet()) {
                        System.out.println(num.getKey());
                    }
                }
                else {
                    System.out.println("Проверьте список команд и выберите одну из списка:\n" +
                            "add - Добавить новый контакт; \n" +
                            "remove - Удалить контакт;\n" +
                            "sortname - Сортировка по имени;\n" +
                            "sortname - Сортировка по фамилии;\n" +
                            "search - Поиск контакта;\n" +
                            "edit - Редактирование контакта.\n" +
                            "exit - Выход;\n" +
                            "save - Сохранить в файл;\n" +
                            "read - Загрузить файл контактов\n" +
                            "==================================\n");
                }
                act = scan.nextLine();
            }





        }

        // Для сортировки по фамилии
        public static void personList(HashMap<String, Person> numbers) throws Exception {

            try {
                if (numbers != null) {
                    List<Person> values = new ArrayList();
                    values.addAll(numbers.values());
                    Collections.sort(values, new Comparator<Person>() {
                        public int compare(Person o1, Person o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    System.out.println("Контакты:\n");
                    for (int i = 0; i < values.size(); i++) {
                        System.out.println(values.get(i).getName());
                    }
                } else {
                    System.out.println("Список контактов пуст! ");
                    ;
                }
            } catch (Exception NullPointerException) {
                System.out.println("Добавьте фамилию каждому контакту!\n" +
                        "Чтобы получить данные всех контактов введите alldata.");
            }
        }
    }
