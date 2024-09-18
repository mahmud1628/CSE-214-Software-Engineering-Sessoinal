package Package;

public class Package_factory {
    public Package get_package(String package_type) {
        if(package_type.equalsIgnoreCase("basic")) {
            return new Basic();
        }
        else if(package_type.equalsIgnoreCase("standard")) {
            return new Standard();
        }
        else if(package_type.equalsIgnoreCase("advanced")) {
            return new Advanced();
        }
        else if(package_type.equalsIgnoreCase("premium")) {
            return new Premium();
        }
        else {
            return null;
        }
    }
}
