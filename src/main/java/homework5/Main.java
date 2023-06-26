package main.java.homework5;

import main.java.homework5.service.init.Initializer;
import main.java.homework5.service.randomizer.StudentClassGroupRandomizer;
import main.java.homework5.view.SortType;
import main.java.homework5.view.StudentClassView;
import main.java.homework5.view.StudentView;
import main.java.homework5.view.TeacherView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Initializer init = new Initializer();
        StudentClassGroupRandomizer studentClassGroupRandomizer = init.getStudentClassGroupRandomizer();
        StudentView studentView = init.studentView;
        TeacherView teacherView = init.teacherView;
        StudentClassView classView = init.studentClassView;

        // Сформируем студентов и преподавателей из данных в /repository/data
        studentView.createRandom(12);
        studentView.sendOnConsole(SortType.ID);
        teacherView.createRandom(3);
        teacherView.sendOnConsole(SortType.ID);

        // Создадим учебную группу и сразу привлечем свободных преподавателей и студентов
        classView.createAndPopulate("ФЭМ1");
        classView.sendOnConsole(SortType.TEAM_ID);

        // Увеличим лимит преподавателей у созданной группы (id, новый лимит)
        classView.setStudentClassTeacherLimitById(1L, 2);
        classView.sendOnConsole(SortType.TEAM_ID);

        // Загрузим наименования учебных групп из /repository/data
        classView.load();
        classView.sendOnConsole(SortType.TEAM_ID);

        // Примем в наше заведение больше студентов и преподавателей
        studentView.create("Иванов Иван", 19, "452-4077");
        studentView.createRandom(257);
        teacherView.createRandom(11);

        // Рандомно заполним свободные учебные группы
        studentClassGroupRandomizer.populateAllStudentClasses();
        classView.sendOnConsole(SortType.TEAM_ID);

        // Куда же попал Поттер на этот раз?
        classView.sendOnConsole(SortType.NONE, "Иванов Иван");
    }

}
