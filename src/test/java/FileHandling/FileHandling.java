package FileHandling;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Map;

public class FileHandling {
@Test
    void ReadTextFile() throws IOException {
       BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\text.txt"));
        String line;
       while( (line=br.readLine())!=null){
           System.out.println(line);


        }
    }
@Test
   void  handleExelFile() throws IOException, InvalidFormatException {

       Workbook workbok=WorkbookFactory.create(new FileInputStream("C:\\Users\\DELL\\Downloads\\7532_Bid_Form.xlsx"));
       Sheet sheet=workbok.getSheet("Overview");
       Row row=sheet.getRow(7);
       Cell cell=row.getCell(2);
       String value=cell.getStringCellValue();
       System.out.println(value);

    }
 // To handle json we need jackson-databind dependancy
    @Test
    void handleJsonFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // To handle json we need jackson-databind dependancy

        Map<String, Object> data = mapper.readValue(
                new File("C:\\Users\\DELL\\Desktop\\playwright_Ts\\package.json"),
                Map.class
        );

        System.out.println(data.get("name"));
        System.out.println(data.get("type"));
        System.out.println(data.get("license"));

    }


       // read file from link
//
//        public static void main(String[] args) throws Exception {
//
//            String urlString = "https://example.com/data.csv";
//            URL url = new URL(urlString);
//
//            BufferedReader br = new BufferedReader(
//                    new InputStreamReader(url.openStream())
//            );
//
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);  // full CSV row
//            }
//
//            br.close();
//        }
    }

