<#import "../components/_layout.ftl" as layout>
<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->
<#assign page_name='signin'>
<#assign page_title='Sign In'>

<@layout.layout page_title page_name; section>

    <#if section = "scripts">

    </#if>
    <#if section = "styles">
        <link rel="stylesheet" href="/css/signin.css" />
    </#if>

    <#if section="content">
        <form class="text-center form-signin" method="post" action="/login">
            <img class="mb-4" src="img/logo.png" alt="" width="80%">

            <label for="inputEmail" class="sr-only">e-mail</label>
            <input type="text" id="inputEmail" name="username" class="form-control" placeholder="e-mail" required autofocus>

            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="password" required>
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </#if>

</@layout.layout>