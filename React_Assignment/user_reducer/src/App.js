import React, { useReducer, useState } from 'react';

const initialState = [];

const reducer = (state, action) => {
  switch (action.type) {
    case 'ADD_USER':
      return [...state, { id: Date.now(), ...action.payload }];

    case 'DELETE_USER':
      return state.filter(user => user.id !== action.payload);

    case 'EDIT_USER':
      return state.map(user =>
        user.id === action.payload.id ? action.payload : user
      );

    default:
      return state;
  }
};

export default function App() {
  const [state, dispatch] = useReducer(reducer, initialState);
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [editId, setEditId] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!name.trim() || !email.trim()) return;

    if (editId !== null) {
      dispatch({
        type: 'EDIT_USER',
        payload: { id: editId, name, email },
      });
      setEditId(null);
    } else {
      dispatch({
        type: 'ADD_USER',
        payload: { name, email },
      });
    }

    setName('');
    setEmail('');
  };

  const handleEdit = (user) => {
    setName(user.name);
    setEmail(user.email);
    setEditId(user.id);
  };

  const handleDelete = (id) => {
    dispatch({ type: 'DELETE_USER', payload: id });
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>UseReducer CRUD Example</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <input
            type="text"
            placeholder="Name"
            value={name}
            onChange={e => setName(e.target.value)}
          />
        </div>
        <div>
          <input
            type="email"
            placeholder="Email"
            value={email}
            onChange={e => setEmail(e.target.value)}
          />
        </div>
        <button type="submit">{editId ? 'Update User' : 'Add User'}</button>
      </form>

      <hr />
      <h3>User List</h3>
      <ul>
        {state.map(user => (
          <li key={user.id}>
            <strong>{user.name}</strong> ({user.email}){' '}
            <button onClick={() => handleEdit(user)}>Edit</button>{' '}
            <button onClick={() => handleDelete(user.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}
