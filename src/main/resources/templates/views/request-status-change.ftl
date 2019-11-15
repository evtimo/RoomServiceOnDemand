<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#import "/spring.ftl" as spring>

<div id="request-change" class="toast toast-modal hide" role="alert" aria-live="assertive" aria-atomic="true">
    <div class="toast-header">
        <strong class="mr-auto"><@spring.message "lbl.status.change"></@spring.message></strong>
        <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
    <div class="toast-body">
        <form action="/request/update" method="post">
            <input type="text" name="id" id="change-id" hidden>
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <div class="form-group">
                <label for="change-title"><@spring.message "lbl.create.room"></@spring.message></label>
                <input type="text" name="room" class="form-control" id="change-title" value="" disabled>
            </div>

            <div class="form-group">
                <label for="status"><@spring.message "lbl.status"></@spring.message></label>
                <select name="status" class="form-control" id="change-status">
                    <option value="NEW"><@spring.message "lbl.requests.new"></@spring.message></option>
                    <option value="PROGRESS"><@spring.message "lbl.requests.progress"></@spring.message></option>
                    <option value="CANCELED"><@spring.message "lbl.requests.cancel"></@spring.message></option>
                    <option value="DONE"><@spring.message "lbl.requests.done"></@spring.message></option>
                </select>
            </div>

            <div class="form-group">
                <label for="comment"><@spring.message "lbl.status.comment"></@spring.message></label>
                <textarea name="comment" class="form-control" id="comment" rows="3"></textarea>
            </div>

            <button type="submit" class="btn btn-primary"><@spring.message "lbl.status.change.button"></@spring.message></button>
        </form>
    </div>
</div>
