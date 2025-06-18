package parastchuk.creational.builder;

public class User {
    private final String name;
    private final String role;
    
    private User(Builder builder) {
        this.name = builder.name;
        this.role = builder.role;
    }

    public static class Builder {
        private String name;
        private String role;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }
        
        public Builder reset() {
            this.name = null;
            this.role = null;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
