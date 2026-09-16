import { useState } from "react";

function ContactManager() {
    const [formData, setFormData] = useState({
        name: "",
        phone: "",
        email: ""
    });

    const [contacts, setContacts] = useState([]);
    const [searchTerm, setSearchTerm] = useState("");
    const [error, setError] = useState("");

    function handleChange(e) {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });
    }

    function handleSubmit(e) {
        e.preventDefault();

        if (formData.name.trim() === "" || formData.phone.trim() === "") {
            setError("Name and phone are required.");
            return;
        }

        const newContact = {
            ...formData,
            id: Date.now()
        };

        setContacts([...contacts, newContact]);

        setFormData({
            name: "",
            phone: "",
            email: ""
        });

        setError("");
    }

    function deleteContact(id) {
        setContacts(
            contacts.filter((contact) => contact.id !== id)
        );
    }

    const filteredContacts = contacts.filter((contact) =>
        contact.name
            .toLowerCase()
            .includes(searchTerm.toLowerCase())
    );

    return (
        <div>
            <h1>Contact Manager</h1>

            <h2>Add Contact</h2>

            <form onSubmit={handleSubmit}>
                <div>
                    <input
                        type="text"
                        name="name"
                        placeholder="Name"
                        value={formData.name}
                        onChange={handleChange}
                    />
                </div>

                <br />

                <div>
                    <input
                        type="text"
                        name="phone"
                        placeholder="Phone"
                        value={formData.phone}
                        onChange={handleChange}
                    />
                </div>

                <br />

                <div>
                    <input
                        type="email"
                        name="email"
                        placeholder="Email (optional)"
                        value={formData.email}
                        onChange={handleChange}
                    />
                </div>

                <br />

                <button type="submit">
                    Add Contact
                </button>
            </form>

            {error && (
                <p style={{ color: "red" }}>
                    {error}
                </p>
            )}

            <hr />

            <h2>Contacts</h2>

            <input
                type="text"
                placeholder="Search by name..."
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
            />

            <ul>
                {filteredContacts.map((contact) => (
                    <li key={contact.id}>
                        <strong>{contact.name}</strong>
                        {" - "}
                        {contact.phone}

                        {contact.email && (
                            <> ({contact.email})</>
                        )}

                        {" "}

                        <button
                            onClick={() => deleteContact(contact.id)}
                        >
                            Delete
                        </button>
                    </li>
                ))}
            </ul>

            {filteredContacts.length === 0 && (
                <p>No contacts found.</p>
            )}
        </div>
    );
}

export default ContactManager;