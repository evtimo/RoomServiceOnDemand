<div id="request-change" class="toast toast-modal hide" role="alert" aria-live="assertive" aria-atomic="true">
    <div class="toast-header">
        <strong class="mr-auto">Request status change</strong>
        <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
    <div class="toast-body">
        <form>
            <div class="form-group">
                <label for="title">Title</label>
                <input type="text" class="form-control" id="title" value="Room 202" disabled>
            </div>

            <div class="form-group">
                <label for="status">Status</label>
                <select class="form-control" id="status">
                    <option selected>New</option>
                    <option>In progess</option>
                    <option>Cancelled</option>
                    <option>Done</option>
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
