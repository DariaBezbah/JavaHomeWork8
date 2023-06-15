package ru.netology.main;

import ru.netology.api.FormDate;
import ru.netology.api.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Александр";
        post.patronymic = "Сергеевич";
        post.surname = "Пушкин";
        post.birthday.day = 6;
        post.birthday.month = 6;
        post.birthday.year = 1799;
        post.passport = "1262 № 190235";
        post.phone = "+7 (921)-424-12-51";
        post.subscription = true;
    }
}
