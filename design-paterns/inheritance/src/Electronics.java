public enum Electronics {
    LAPTOP("red"){
        public void hello(){            // override methods for each value or implement abstract method present in the enum class
            System.out.println("hello form laptop");
        }
    },
    MOBILE("black"){
        public void hello(){
            System.out.println("hello form mobile");
        }
    },
    TABLET("blue"){
        public void hello(){
            System.out.println("hello form tablet");
        }
    };
    public void hello(){
        System.out.println("hello form enum");
    }
    private String color;

    public void printColor(){
        System.out.println(color);
    }

    Electronics(String color) {
        this.color = color;
    }
}
