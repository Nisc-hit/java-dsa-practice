import { useState } from 'react';
function DropdownSelect() {
    const [selected, setSelected] = useState('java');
    return (
        <div>
            <select value={selected} onChange={(e) => setSelected(e.target.value)}>
                <option value="java">Java</option>
                <option value="python">Python</option>
                <option value="javascript">JavaScript</option>
            </select>
            <p>You selected: {selected}</p>
        </div>
    );
}
export default DropdownSelect;