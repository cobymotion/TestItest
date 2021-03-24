package mx.edu.tecmm.testitext;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luiscobian
 */
public class MainClass {
    
    public static void main(String[] args)throws IOException, DocumentException{
        String dest = "prueba.pdf"; 
        File archivo = new File(dest);
        new MainClass().pdfCreate(dest);
    }
    
    public void pdfCreate(String dest) throws IOException, DocumentException{
        
        Document document = new Document(PageSize.LETTER);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
        writer.setPageEvent(new Background());
        document.setMargins(36, 36, 120, 50);
        document.open();
        
        // contenido 
        
        Paragraph p1 = new Paragraph("Fecha");
        p1.setAlignment(Element.ALIGN_RIGHT);        
        document.add(p1);
        document.add(new Paragraph(Chunk.NEWLINE));
        document.add(new Paragraph(new Chunk("Cliente", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Luis Cobian", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(new Chunk("Tu objetivo", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Bajar de peso", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        
        document.add(new Paragraph(Chunk.NEWLINE));
        
        document.add(new Paragraph(new Chunk("Ejercicios por día", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        
        document.add(new Paragraph(Chunk.NEWLINE));      
        
        // Lunes 
        PdfPTable table;
        table = new PdfPTable(1);
        table.setWidthPercentage(100);
        PdfPCell cell; 
        cell = new PdfPCell(new Phrase("LUNES"));
        cell.setBorder(Rectangle.BOTTOM);
        cell.setUseBorderPadding(true);
        cell.setBorderWidthBottom(3);
        cell.setBorderColorBottom(BaseColor.RED);
        table.addCell(cell);        
        document.add(table);         
        // ejercicios 
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(Chunk.NEWLINE)); 
        
         // Lunes         
        table = new PdfPTable(1);
        table.setWidthPercentage(100);         
        cell = new PdfPCell(new Phrase("MARTES"));
        cell.setBorder(Rectangle.BOTTOM);
        cell.setUseBorderPadding(true);
        cell.setBorderWidthBottom(3);
        cell.setBorderColorBottom(BaseColor.RED);
        table.addCell(cell);        
        document.add(table);         
        // ejercicios 
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(Chunk.NEWLINE)); 
        
        // Lunes         
        table = new PdfPTable(1);
        table.setWidthPercentage(100);         
        cell = new PdfPCell(new Phrase("MIERCOLES"));
        cell.setBorder(Rectangle.BOTTOM);
        cell.setUseBorderPadding(true);
        cell.setBorderWidthBottom(3);
        cell.setBorderColorBottom(BaseColor.RED);
        table.addCell(cell);        
        document.add(table);         
        // ejercicios 
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(Chunk.NEWLINE)); 
        
        // Lunes         
        table = new PdfPTable(1);
        table.setWidthPercentage(100);         
        cell = new PdfPCell(new Phrase("JUEVES"));
        cell.setBorder(Rectangle.BOTTOM);
        cell.setUseBorderPadding(true);
        cell.setBorderWidthBottom(3);
        cell.setBorderColorBottom(BaseColor.RED);
        table.addCell(cell);        
        document.add(table);         
        // ejercicios 
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(Chunk.NEWLINE)); 
        
        // Lunes         
        table = new PdfPTable(1);
        table.setWidthPercentage(100);         
        cell = new PdfPCell(new Phrase("SABADO"));
        cell.setBorder(Rectangle.BOTTOM);
        cell.setUseBorderPadding(true);
        cell.setBorderWidthBottom(3);
        cell.setBorderColorBottom(BaseColor.RED);
        table.addCell(cell);        
        document.add(table);         
        // ejercicios 
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(new Chunk("Ejercicio ", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Repeticion: 10", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        document.add(new Paragraph(Chunk.NEWLINE)); 
        
        
        
        document.add(new Paragraph(Chunk.NEWLINE)); 
        document.add(new Paragraph(new Chunk("Observaciones", new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD))));
        document.add(new Paragraph(new Chunk("Bajar de peso", new Font(Font.FontFamily.TIMES_ROMAN, 12))));
        // fondo 
        /*PdfContentByte canvas = writer.getDirectContentUnder();
        Image image = Image.getInstance("backgroundpdf.jpg");
        image.scaleAbsolute(PageSize.LETTER);
        image.setAbsolutePosition(0, 0);
        canvas.addImage(image);*/
        document.close();
    }
    
    public class Background extends PdfPageEventHelper{

        @Override
        public void onStartPage(PdfWriter writer, Document document) {
            try {
                super.onStartPage(writer, document); //To change body of generated methods, choose Tools | Templates.
                PdfContentByte canvas = writer.getDirectContentUnder();
                Image image = Image.getInstance("backgroundpdf.jpg");
                image.scaleAbsolute(PageSize.LETTER);
                image.setAbsolutePosition(0, 0);           
                canvas.addImage(image);
            } catch (Exception ex) {
                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
