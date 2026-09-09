import { useState } from 'react';
function LikeButton() {
    const [isLiked, setIsLiked] = useState(false);
    const [likeCount, setLikeCount] = useState(0);
    function handleClick() {
        if (isLiked) {
            setIsLiked(false);
            // count does NOT decrease when unliking, per the requirement
        } else {
            setIsLiked(true);
            setLikeCount(likeCount + 1);
        }
    }
    return (
        <div>
            <button onClick={handleClick}>
                {isLiked ? '⁄n Liked' : 'n Like'}
            </button>
            <p>Likes: {likeCount}</p>
        </div>
    );
}
export default LikeButton;