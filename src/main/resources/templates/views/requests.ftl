<#import "../components/_layout.ftl" as layout>
<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->

<#assign page_name='requests'>
<#assign page_title='Requests'>
<#import "/spring.ftl" as spring>

<@layout.layout page_title page_name; section>
    <#if section = "scripts">
        <script src="/js/moment.js"></script>
        <script src="/js/tempusdominus-bootstrap-4.min.js"></script>

        <script src="/js/requestHelper.js"></script>
        <script src="/js/modal.js"></script>
    </#if>
    <#if section = "styles">
        <link rel="stylesheet" href="/css/request.css" />
    </#if>



    <#if section="content">
        <div class="container">

            <#if errorMessage??>
                <br>
                <div style="color:red;font-style:italic;font-size: large">
                    ${errorMessage}
                </div>
            </#if>

            <#if currentUser.role == "CLIENT">
                <h1 class="mt-5"><@spring.message "lbl.create.my"></@spring.message></h1>
                <button type="button" class="mt-2 mb-2 btn btn-primary btn-md modal-trigger" data-modal-type="create-request"><@spring.message "lbl.requests.create"></@spring.message></button>
            </#if>

            <#if currentUser.role == "ADMIN">
                <h1 class="mt-5"><@spring.message "lbl.create.requests"></@spring.message></h1>
            <#--                <button type="button" class="mt-2 mb-2 btn btn-primary btn-md modal-trigger" data-modal-type="create-request">Create new</button>-->
            </#if>

            <ol class="breadcrumb mb-0">
                <li class="breadcrumb-item active" aria-current="page" data-request-type="ALL"><@spring.message "lbl.requests.all"></@spring.message></li>
                <li class="breadcrumb-item" aria-current="page" data-request-type="NEW" ><@spring.message "lbl.requests.new"></@spring.message></li>
                <li class="breadcrumb-item" aria-current="page" data-request-type="PROGRESS" ><@spring.message "lbl.requests.progress"></@spring.message></li>
                <li class="breadcrumb-item" aria-current="page" data-request-type="CANCELED" ><@spring.message "lbl.requests.cancel"></@spring.message></li>
                <li class="breadcrumb-item" aria-current="page" data-request-type="DONE" ><@spring.message "lbl.requests.done"></@spring.message></li>
            </ol>

            <hr class="mt-2 mb-5">

            <div class="row">
                <#list requestList as request>
                    <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-${request.status}">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">${request.room}</h5>
                                <p class="card-text">${request.date}</p>
                                <span class="badge badge-secondary badge-${request.status} mb-2">${request.status.description}</span>
                                <#if currentUser.role=="CLIENT" && request.status=="DONE">
                                    <button type="button" class="btn btn-primary btn-sm float-right modal-trigger" data-modal-type="feedback" data-room="${request.room}" data-id="${request.id}"><@spring.message "lbl.requests.feedback"></@spring.message></button>
                                <#elseif currentUser.role=="ADMIN" && request.status!="DONE">
                                    <button type="button" class="btn btn-primary btn-sm float-right modal-trigger" data-modal-type="request-change" data-status="${request.status}" data-room="${request.room}" data-id="${request.id}"><@spring.message "lbl.requests.edit"></@spring.message></button>
                                </#if>
                            </div>
                        </div>
                    </div>
                </#list>
            </div>
        </div>
    </#if>
<!-- TODO: MAKE THIS INCLUDE ONLY FOR CLIENT -->
<#if currentUser.role == "CLIENT">
<#include "../views/feedback.ftl">
<#include "../views/create-request-modal.ftl">
</#if>
<!-- TODO: MAKE THIS INCLUDE ONLY FOR ADMIN -->
<#if currentUser.role == "ADMIN">
<#include "../views/request-status-change.ftl">
</#if>
</@layout.layout>
