public class ResourceClient {
    public static void main(String[] args) {
        Resource task1 = new Resource.Builder().description("First Task").summary("Summary of Task1").build();
        System.out.println(task1);

        Resource task2 = new Resource.Builder().description("Second Task").author("Second author").summary("Summary of Task2").reference("https://www.google.ro/").build();
        System.out.println(task2);

    }
}
