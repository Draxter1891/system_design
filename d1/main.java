class Main {
    public static void main(String[] args) {
        MenuItem dosa = new MenuItem();
        dosa.name = "Masala Dosa";
        dosa.price = 120;
        dosa.isVeg = true;

        System.out.print("Menu Item:");
        System.out.println(dosa.name + " " + dosa.price);
    }
}