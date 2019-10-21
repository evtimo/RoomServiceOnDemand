<div id="feedback" class="toast toast-modal hide" role="alert" aria-live="assertive" aria-atomic="true">
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
                <label for="title">Rate</label>
                <div class="feedback-rate risingstar d-flex justify-content-center flex-row-reverse">

                    <input type="radio" id="star5" name="rating" value="5"/>
                    <label for="star5" title="5 star">
                        <i class="fas fa-star"></i>
                    </label>

                    <input type="radio" id="star4" name="rating" value="4"/>
                    <label for="star4" title="4 star">
                        <i class="fas fa-star"></i>
                    </label>

                    <input type="radio" id="star3" name="rating" value="3"/>
                    <label for="star3" title="3 star">
                        <i class="fas fa-star"></i>
                    </label>

                    <input type="radio" id="star2" name="rating" value="2"/>
                    <label for="star2" title="2 star">
                        <i class="fas fa-star"></i>
                    </label>

                    <input type="radio" id="star1" name="rating" value="1"/>
                    <label for="star1" title="1 star">
                        <i class="fas fa-star"></i>
                    </label>
                </div>
            </div>

            <div class="form-group">
                <label for="comment">Comment</label>
                <textarea class="form-control" id="comment" rows="3"></textarea>
            </div>

            <button type="submit" class="btn btn-primary">Send</button>
        </form>
    </div>
</div>