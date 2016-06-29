package org.boreas.study.httpclienttest;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by boreas320 on 16/6/24.
 */
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getPart("")
        ServletInputStream inputStream = req.getInputStream();


        String desc = req.getParameter("desc");
        File file = new File(desc);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bytes = new byte[1024];

        int count = 0;
        do {
            count = inputStream.read(bytes);
            fileOutputStream.write(bytes, 0, count);
        } while (count == 1024);
        fileOutputStream.flush();

        resp.getWriter().println(file.getAbsolutePath());
        resp.getWriter().flush();

    }
}
