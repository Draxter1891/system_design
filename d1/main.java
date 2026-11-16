class Main {
    public static void main(String[] args) {
        // MenuItem dosa = new MenuItem();
        // dosa.name = "Masala Dosa";
        // dosa.price = 120;
        // dosa.isVeg = true;

        MenuItem dosa = new MenuItem("Masala Dosa", 120, true);

        System.out.print("Menu Item:");
        System.out.println(dosa.name + " " + dosa.price);
    }
}