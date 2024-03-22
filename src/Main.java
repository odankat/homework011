public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Толстой", "Лев");
        Author ivanTurgenev = new Author("Тургеньев", "Иван");
        Book warAndPeace = new Book("Война и Мир", levTolstoi, 1867);
        Book fatherAndSons = new Book("Отцы и Дети", ivanTurgenev, 1862);
        System.out.println(levTolstoi.getName());
        System.out.println(warAndPeace.getReleaseData());
        fatherAndSons.setReleaseData(1613);
        warAndPeace.setReleaseData(666);
        System.out.println(fatherAndSons.getReleaseData());
        System.out.println("warAndPeace = " + warAndPeace.getReleaseData());
        System.out.println("fatherAndSons = " + fatherAndSons.getReleaseData());
        System.out.println("warAndPeace = " + warAndPeace.getAuthor());




    }
}