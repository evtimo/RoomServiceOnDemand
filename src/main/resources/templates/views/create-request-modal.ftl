<div id="create-request" class="toast toast-modal hide" role="alert" aria-live="assertive" aria-atomic="true">
    <div class="toast-header">
        <strong class="mr-auto">Create request</strong>
        <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
    <div class="toast-body">
        <form>
            <div class="form-group">
                <label for="room">Room</label>
                <input type="number" class="form-control" id="room" placeholder="Room">
            </div>

            <div class="form-group">
                <label>Date</label>
                <div class="input-group date" id="datepicker" data-target-input="nearest">
                    <input type="text" class="form-control datetimepicker-input" data-target="#datepicker"/>
                    <div class="input-group-append" data-target="#datepicker" data-toggle="datetimepicker">
                        <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label>Time</label>
                <div class="input-group date" id="timepicker" data-target-input="nearest">
                    <input type="text" class="form-control datetimepicker-input" data-target="#timepicker"/>
                    <div class="input-group-append" data-target="#timepicker" data-toggle="datetimepicker">
                        <div class="input-group-text"><i class="fa fa-clock"></i></div>
                    </div>
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Create</button>
        </form>
    </div>
</div>
