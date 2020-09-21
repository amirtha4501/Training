package in.kpriet.training.oops;

class Profile {

    private String name;
    String roll;

    Profile() {
        this.name = "madhu";
    }  

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }
}


class EncapsulationDemo {

    public static void main(String[] args) {
        
        boolean isAuthorized = false;

        Profile profile = new Profile();
        // System.out.println(profile.name);

        System.out.println(profile.getName());

        if(isAuthorized) {
            profile.setName("ashu");
            System.out.println("Name is updated" + profile.getName());
        } else {
            System.out.println("You're unauthorized");
        }   
    }
}
