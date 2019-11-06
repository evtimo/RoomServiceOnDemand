<#macro layout page_title, page_name>
    <#if !page_title??>
        <#assign page_title=''>
    </#if>

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <title>${page_title} | Room Service on Demand</title>

        <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">
        <link href="/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet">
        <link href="/css/fontawesome/css/all.min.css" rel="stylesheet">

        <link href="/css/header.css" rel="stylesheet">

        <#nested "styles">
    </head>

    <body>

        <#include "_header.ftl">

        <#nested "content">

        <#include "_footer.ftl">

        <script src="/js/jquery-3.4.1.min.js"></script>
        <script src="/js/bootstrap/bootstrap.min.js"></script>
        <script src="/js/popper.min.js"></script>

        <#nested "scripts">

    </body>
    </html>

</#macro>