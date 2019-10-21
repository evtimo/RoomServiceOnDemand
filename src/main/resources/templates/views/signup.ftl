<#import "../components/_layout.ftl" as layout>
<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->

<#assign page_name='signup'>
<#assign page_title='Sign Up'>

<@layout.layout page_title page_name; section>

    <#if section = "scripts">

    </#if>
    <#if section = "styles">
        <link rel="stylesheet" href="/css/signup.css" />
    </#if>

    <#if section="content">
        <form class="text-center form-signup" method="post" action="/signUpPost">
            <img class="mb-4" src="img/logo.png" alt="" width="80%">

            <label for="inputEmail" class="sr-only">e-mail</label>
            <input type="email" name="email" id="inputEmail" class="form-control" placeholder="e-mail" required autofocus>

            <label for="inputName" class="sr-only">full name</label>
            <input type="text" id="inputName" name="name" class="form-control" placeholder="full name" required autofocus>

            <label for="inputPhone" class="sr-only">phone</label>
            <input type="text" id="inputPhone" name="phoneNumber" class="form-control" placeholder="phone" required autofocus>

            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="password" required>
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
        </form>
    </#if>

</@layout.layout>