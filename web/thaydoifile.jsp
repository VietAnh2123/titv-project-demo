<%-- 
    Document   : thaydoifile
    Created on : Jan 15, 2024, 5:03:42 PM
    Author     : AD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
    <center>
        <h1>Up file</h1>
        <div class="container mt-5">
            <form action="upload-file" method="POST" enctype="multipart/form-data">
                <input class="form form-control" type="file" name="file" size="60">
                <input class="btn btn-primary mt-5" type="submit" value="Submit">
            </form>
        </div>
    </center>

</body>
</html>
