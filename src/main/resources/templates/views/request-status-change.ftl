<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->

<div id="request-change" class="toast toast-modal hide" role="alert" aria-live="assertive" aria-atomic="true">
    <div class="toast-header">
        <strong class="mr-auto">Request status change</strong>
        <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
    <div class="toast-body">
        <form action="/request/update" method="post">
            <input type="text" name="id" id="change-id" hidden>
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <div class="form-group">
                <label for="change-title">Room</label>
                <input type="text" name="room" class="form-control" id="change-title" value="" disabled>
            </div>

            <div class="form-group">
                <label for="status">Status</label>
                <select name="status" class="form-control" id="change-status">
                    <option value="NEW">New</option>
                    <option value="PROGRESS">In progress</option>
                    <option value="CANCELED">Cancelled</option>
                    <option value="DONE">Done</option>
                </select>
            </div>

            <div class="form-group">
                <label for="comment">Comment</label>
                <textarea class="form-control" id="comment" rows="3"></textarea>
            </div>

            <button type="submit" class="btn btn-primary">Change</button>
        </form>
    </div>
</div>
