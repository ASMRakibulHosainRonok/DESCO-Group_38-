
package ModelClass;

public class Notification {
    private int notificationId;
    private String title;
    private String description;
    private String date;

    // Constructor
    public Notification(int notificationId, String title, String description, String date) {
        this.notificationId = notificationId;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    // Getters and Setters
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
