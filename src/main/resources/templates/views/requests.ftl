<#import "../components/_layout.ftl" as layout>
<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->

<#assign page_name='requests'>
<#assign page_title='Requests'>

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

            <h1 class="mt-5">My cleaning requests</h1>
            <button type="button" class="mt-2 mb-2 btn btn-primary btn-md modal-trigger" data-modal-type="create-request">Create new</button>

            <ol class="breadcrumb mb-0">
                <li class="breadcrumb-item active" aria-current="page" data-request-type="all" >All</li>
                <li class="breadcrumb-item" aria-current="page" data-request-type="new" >New</li>
                <li class="breadcrumb-item" aria-current="page" data-request-type="in-progress" >In progress</li>
                <li class="breadcrumb-item" aria-current="page" data-request-type="canceled" >Canceled</li>
                <li class="breadcrumb-item" aria-current="page" data-request-type="done" >Done</li>
            </ol>

            <hr class="mt-2 mb-5">

            <div class="row">
                <#list requestList as request>
                    <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-done">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">${request.room}</h5>
                                <p class="card-text">${request.date}</p>
                                <span class="badge badge-secondary mb-2">${request.status}</span>
                                <#if currentUser.role=="CLIENT" && request.status=="Done">
                                    <button type="button" class="btn btn-primary btn-sm float-right modal-trigger" data-modal-type="feedback">Feedback</button>
                                <#elseif currentUser.role=="ADMIN" && request.status!="Done">
                                </#if>
                            </div>
                        </div>
                    </div>
                </#list>

                <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-done">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Room 202</h5>
                            <p class="card-text">11.01.19 10:00</p>
                            <span class="badge badge-secondary mb-2">Done</span>
                            <button type="button" class="btn btn-primary btn-sm float-right modal-trigger" data-modal-type="feedback">Feedback</button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-canceled">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Room 202</h5>
                            <p class="card-text">11.01.19 10:00</p>
                            <span class="badge badge-danger mb-2">Canceled</span>
                            <button type="button" class="btn btn-primary btn-sm float-right modal-trigger" data-modal-type="request-change">Edit</button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-in-progress">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Room 202</h5>
                            <p class="card-text">11.01.19 10:00</p>
                            <span class="badge badge-warning mb-2">In progress</span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-new">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Room 202</h5>
                            <p class="card-text">11.01.19 10:00</p>
                            <span class="badge badge-success mb-2">New</span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-new">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Room 202</h5>
                            <p class="card-text">11.01.19 10:00</p>
                            <span class="badge badge-success mb-2">New</span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-4 mb-4 request request-new">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Room 202</h5>
                            <p class="card-text">11.01.19 10:00</p>
                            <span class="badge badge-success mb-2">New</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </#if>
<!-- TODO: MAKE THIS INCLUDE ONLY FOR CLIENT -->
<#include "../views/feedback.ftl">
<#include "../views/create-request-modal.ftl">
<!-- TODO: MAKE THIS INCLUDE ONLY FOR ADMIN -->
<#include "../views/request-status-change.ftl">

</@layout.layout>
