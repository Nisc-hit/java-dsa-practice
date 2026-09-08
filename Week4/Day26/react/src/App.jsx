function UserCard(props) {
    return (
        <div>
            <h3>{props.name}</h3>
            <p>Age: {props.age}</p>
            <p>City: {props.city}</p>
        </div>
    );
}
export default UserCard;