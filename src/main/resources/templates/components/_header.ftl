<#-- @ftlvariable name="page_name" type="java.util.Optional<String>" -->

<#if !page_name??>
    <#assign page_name=''>
</#if>

<header class="navbar navbar-expand navbar-dark header-bg">
    <div class="container">
        <a class="navbar-brand" href="/">
            <img class="header-logo" src="/img/header_logo.png" alt="">
        </a>

        <ul class="navbar-nav justify-content-end">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    EN
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">EN</a>
                    <a class="dropdown-item" href="#">RU</a>
                </div>
            </li>
            <li class="nav-item">
                <#if page_name=='signin'>
                    <a class="nav-link" href="/signUp">Sign Up</a>
                <#elseif page_name=='signup'>
                    <a class="nav-link" href="/login">Sign In</a>
                <#else>
                    <a class="nav-link" href="/logout">Log Out</a>
                </#if>
            </li>
        </ul>
    </div>
</header>