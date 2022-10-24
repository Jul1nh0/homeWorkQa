public class Main {
    public static void main(String[] args) {
        Post post = new  Post();

        post.name = "Вася";
        post.passport = "4222 № 456789";
        post.patronymic = "Серегеевич";
        post.surname = "Волков";
        post.phone = "+79857894563";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 2;
        post.birthday.month = 5;
        post.birthday.year = 1989;

    }
}
