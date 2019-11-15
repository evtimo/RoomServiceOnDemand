<#-- @ftlvariable name="page_name" type="java.util.Optional<String>" -->
<#import "/spring.ftl" as spring>

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
                <div id="locales" class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" id="lang_en" href="?lang=en" >EN</a>
                    <a class="dropdown-item" id="lang_ru" href="?lang=ru">RU</a>
                </div>
            </li>
            <li class="nav-item">
                <#if page_name=='signin'>
                    <a class="nav-link" href="/signUp"><@spring.message "lbl.header.signup"></@spring.message></a>
                <#elseif page_name=='signup'>
                    <a class="nav-link" href="/login"><@spring.message "lbl.header.signin"></@spring.message></a>
                <#else>
                    <a class="nav-link" href="/logout"><@spring.message "lbl.header.logout"></@spring.message></a>
                </#if>
            </li>
        </ul>
    </div>
</header>