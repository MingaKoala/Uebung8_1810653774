public class Weather {


    private int id;
    private String main;
    private String description;
    private String icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("\n----- Weather Information-----\n");

        sb.append("ID: " + getId() + "\n");

        sb.append("Main: " + getMain() + "\n");

        sb.append("Descriptiong: " + getDescription() + "\n");

        sb.append("Icon: " + getIcon() + "\n");

        sb.append("*****************************");

        return sb.toString();

    }
}

