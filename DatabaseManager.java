import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class DatabaseManager {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public DatabaseManager() {
        mongoClient = MongoClients.create(); // connects to default host and port i.e. localhost:27017
        database = mongoClient.getDatabase("school");
        collection = database.getCollection("students");
    }

    public void addStudent(Student student) {
        Document doc = new Document("name", student.getName())
                .append("age", student.getAge())
                .append("course", student.getCourse());
        collection.insertOne(doc);
    }

    public void close() {
        mongoClient.close();
    }
}
