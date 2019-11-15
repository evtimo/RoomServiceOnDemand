<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->
<#import "/spring.ftl" as spring>

<div id="create-request" class="toast toast-modal hide" role="alert" aria-live="assertive" aria-atomic="true">
    <div class="toast-header">
        <strong class="mr-auto"><@spring.message "lbl.create.title"></@spring.message></strong>
        <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>

    </div>
    <div class="toast-body">
        <form action="/request" method="POST">
            <div class="form-group">
                <label for="room"><@spring.message "lbl.create.room"></@spring.message></label>
                <input type="number" name="room" class="form-control" id="room" placeholder="<@spring.message "lbl.create.room"></@spring.message>">
            </div>

            <div class="form-group">
                <label><@spring.message "lbl.create.date"></@spring.message></label>
                <div class="input-group date" id="datepicker" data-target-input="nearest">
                    <input type="text" name="datetime" class="form-control datetimepicker-input" data-target="#datepicker"/>
                    <div class="input-group-append" data-target="#datepicker" data-toggle="datetimepicker">
                        <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                    </div>
                </div>
            </div>

            <input type="hidden" name="_csrf" value="${_csrf.token}">

<#--            <div class="form-group">-->
<#--                <label>Time</label>-->
<#--                <div class="input-group date" id="timepicker" data-target-input="nearest">-->
<#--                    <input type="text" class="form-control datetimepicker-input" data-target="#timepicker"/>-->
<#--                    <div class="input-group-append" data-target="#timepicker" data-toggle="datetimepicker">-->
<#--                        <div class="input-group-text"><i class="fa fa-clock"></i></div>-->
<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->

            <button type="submit" class="btn btn-primary"><@spring.message "lbl.create.create"></@spring.message></button>
        </form>
    </div>
</div>
