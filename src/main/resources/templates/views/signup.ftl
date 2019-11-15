<#import "../components/_layout.ftl" as layout>
<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->
<#import "/spring.ftl" as spring>

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
            <input type="email" name="email" id="inputEmail" class="form-control" placeholder="<@spring.message "lbl.login.username"></@spring.message>" required autofocus>

            <label for="inputName" class="sr-only">full name</label>
            <input type="text" id="inputName" name="name" class="form-control" placeholder="<@spring.message "lbl.signup.fullName"></@spring.message>" required autofocus>

            <label for="inputPhone" class="sr-only">phone</label>
            <input type="text" id="inputPhone" name="phoneNumber" class="form-control" placeholder="<@spring.message "lbl.signup.phone"></@spring.message>" required autofocus>

            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="<@spring.message "lbl.login.password"></@spring.message>" required>
            <input type="hidden" name="_csrf" value="${_csrf.token}">

            <#if errorMessage??>
                <div style="color:red;font-style:italic;">
                    ${errorMessage}
                </div>
            </#if>

            <button class="btn btn-lg btn-primary btn-block" type="submit"><@spring.message "lbl.header.signup"></@spring.message></button>
        </form>
    </#if>

</@layout.layout>