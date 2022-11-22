import java.util.HashMap;



    public class LoginBackEnd {


        private HashMap<String, Person> mydatabase;
        private static LoginBackEnd loginBackEnd;

        private LoginBackEnd() {
            this.mydatabase = new HashMap<>();
        }
        public static LoginBackEnd getInstance() {
            if (loginBackEnd == null) {
                loginBackEnd = new LoginBackEnd();
            }
            return loginBackEnd;
        }

        public boolean addUser(String username, String firstName, String lastName, String email, String password) {
            Person person = new Person(firstName, lastName, email, password);
            if(!mydatabase.containsKey(username)) {
                mydatabase.put(username, person);
                return true;
            }

            return false;
        }


        public Person loginUser(String username, String password) {
            if(mydatabase.containsKey(username) && mydatabase.get(username).pwd.equals(password)) {
                return mydatabase.get(username);
            }
            return null;
        }









        public class Person{
            String first_name;
            String last_name;
            String email;
            String pwd;
            public Person(String first_name, String last_name,String email, String pwd) {
                this.first_name = first_name;
                this.last_name = last_name;
                this.email = email;
                this.pwd = pwd;
            }


        }
    }

